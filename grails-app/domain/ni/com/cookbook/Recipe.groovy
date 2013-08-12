package ni.com.cookbook

class Recipe {

    String name
    String type 
    byte[] image
    Integer vote
    String serve
    String occasion
    String method
    boolean enable
	Date dateCReated
	Date lastUpdated

    static constraints = {
        name blank:false, maxSize:70
        type inList:["food", "drink", "dessert", "sweet"]
        image  blank:true, maxSize:250000
        vote blank:true
        serve blank:false
        occasion inList:["hollyweek", "Christmas", "etc"]
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
    static hasMany = [alias:Alias, ingredient:Ingredient]
}
