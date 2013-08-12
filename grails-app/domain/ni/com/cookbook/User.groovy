package ni.com.cookbook

class User {

    String email
    String fullName
    String password
    String role 
    boolean enable 
    Date dateCreated
	Date lastUpdated

    static constraints = {
        email blank:false, email:true, unique:true
        fullName blank:false, maxSize:50
        password blank:false
        role inList:["admin", "user", "collaborator"]
    }

    static namedQueries = {

    }

    static mapping = {
    	version false
    }

    String toString() {

    }
    
    static hasMany = [recipe:Recipe]    
}
