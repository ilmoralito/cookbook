package ni.com.cookbook

class Recipe {

    String name
    String type 
    byte[] image
    Integer vote = 0
    Integer serve
    String occation
    String method
    boolean enable
	Date dateCreated
	Date lastUpdated

    static constraints = {
        name blank:false, maxSize:70
        type inList:["food", "drink", "dessert", "sweet"]
        image nullable:true, maxSize:250000
        vote min:0
        serve blank:false, min:1
        occation inList:["hollyweek", "Christmas", "DayDead"]
        method blank:false
    }

    static namedQueries = {

    }

    static mapping = {
    	version false
    }

    String toString() {

    }

    static belongsTo = [user:User]
    static hasMany = [alias:String, ingredient:Ingredient]

}
