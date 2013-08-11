package ni.com.cookbook

class Ingredient {

    String mAndQ 
    String name
    Date dateCReated
	Date lastUpdated

    static constraints = {
        mAndQ blank:false
        name blank:false
    }

    static namedQueries = {

    }

    static mapping = {
    	version false
    }

    String toString() {

    }
}
