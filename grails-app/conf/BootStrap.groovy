import ni.com.cookbook.*
import grails.util.Environment
class BootStrap {

    def init = { servletContext ->
    	switch(Environment.current) {
    		case Environment.DEVELOPMENT:
    		def jose = new User(
    			email:'jose@gmail.com',
    			password:'1234',
    			fullName:'Jose Torrez',
    			role:'admin'
    			)

    		if(!jose.save()) {
    			jose.errors.allErrors.each {
    				print it
    			}
    		}

    		def arrozCholenco = new Recipe(
    			name:'arrozCholenco',
    			type:'food',
    			serve:'1',
    			occasion:'hollyweek',
    			method:'1 cocer un caballo, etc...'
    			)

    		jose.addToRecipe(arrozCholenco)

    		if (!arrozCholenco.save()) {
    			arrozCholenco.errors.allErrors.each{
    				print it
    			}
    		}

    		arrozCholenco.addToAlias("ArrozAlahorse")

    		
    		break
    	}
    }

    def destroy = {
    }
}
