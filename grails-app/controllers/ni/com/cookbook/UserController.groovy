package ni.com.cookbook

class UserController {

	static defaultAction = "login"
	static allowedMethods = [
		list:"GET"
	]

    def index() {
    	
    }

    def login(){}

    def logout() {
    	session.user = null
    	redirect(action:'login')
    }

    def create(){
    	[userInstance: new User(params)]
    }

    def save(){
    	def userInstance = new User(params)
    	if (!userInstance.save()) {
    		render(view:"create", model:[userInstance:userInstance])
    		return false
    	}

    	redirect(action:"login")
    }


    def authenticate() {
        
        def userInstance = User.findAllByEmailAndPasswordAndEnable(params.email, params.password.encodeAsSHA1(), true)
 		
    	if(!userInstance) {
            flash.message = message(code:'ni.com.cookbook.error')
    		redirect(action:'login')
    		return false
    	}

    	userInstance.role.each{session.user = it}

    	switch(session.user) {
            case 'admin':
                print "ENTRO admin"  
                break
            case 'client':
                print "ENTRO cliente"
                break
            case 'user':
	            print "ENTRO cliente"
	            break
        }
	}
}
