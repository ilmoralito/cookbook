package ni.com.cookbook

class RecipeController {

	static defaultAction = "list"
	static allowedMethods = [
		list:"GET",
		delete:"GET"
	]

    def list() {
    	def recipes
    	def role = session?.user.role

    	if (role == "admin" || "collaborator") {
    		recipes = Recipe.list()
    	} else {
    		recipes = Recipe.byUser(session.user).list(params)
    	}

    	[recipes:recipes]
    }

    def createFlow = {
    	init {
    		action {
    			[recipe:new Recipe(params), user:session?.user]
    		}

    		on("success").to "createRecipe"
    	}

    	createRecipe {
    		on("create") {
    			def recipe = new Recipe(
    				name:params.name,
    				type:params?.type,
    				serve:params.int("serve"),
    				occation:params?.occation,
    				user:flow.user
    			)

    			if (!recipe.save()) {
    				flow.recipe = recipe
    				return error()
    			}

                [recipe:recipe]

   			}.to "ingredients"
    	}

    	ingredients {
            on("addIngredient") {
                def ingredient = new Ingredient(
                    mAndQ:params.mAndQ,
                    name:params.name
                )

                if (!ingredient.save()) {
                    flow.ingredient = ingredient
                    return error()
                }

                print ingredient

                flow.recipe.addToIngredients(ingredient)
            }.to "ingredients"

            on("deleteRecipe"){
                flow.recipe.delete()
            }.to "done"
    	}

    	done {
    		redirect controller:"recipe", action:"list"
    	}
    }

    def delete(Integer id) {
    	def recipe = Recipe.findByUserAndId(session?.user, id)

    	if (!recipe) {
    		response.sendError 404
    	}

    	recipe.delete()
    	flash.message = "Reseta borrada"

    	redirect action:"list"
    }

}
