package ni.com.cookbook

class Alias {


    String name 
	Date dateCReated
	Date lastUpdated

    static constraints = {
        name blank:false, maxSize:50
    }

    static namedQueries = {

    }

    static mapping = {
    	version false
    }

    String toString() {

    }
}
