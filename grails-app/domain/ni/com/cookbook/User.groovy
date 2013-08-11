package ni.com.cookbook

class User {

    String email
    String fullName
    String password
    String role 
    boolean enable 
    Date dateCReated
	Date lastUpdated

    static constraints = {
        email blank:false, email:true, unique:true
        fullName blank:false, maxSize:50
        password blank:false
        role inList:["admin", "user", "collaborator"]
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
