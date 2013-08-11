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
<<<<<<< HEAD
=======
        enable blank:false
>>>>>>> 7c6c894a6706b1cede74b993c8f81b291ffd1aab
    }

    static namedQueries = {

    }

    static mapping = {
    	version false
    }

    String toString() {

    }
}
