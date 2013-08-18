package ni.com.cookbook

class UserController {

	static defaultAction = "actionHere"
	static allowedMethods = [
		list:"GET"
	]

    def index() {
    	
    }

    def login(){}

    def create(){
    	[userInstance: new User(params)]
    }
}
