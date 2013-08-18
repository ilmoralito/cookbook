package ni.com.cookbook

class SecurityFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                def publicActions = ['login','authenticate','create','save', 'logout']
                if(!session?.user && !publicActions.contains(actionName)) {
                    redirect(controller:'user')
                    return false
                }
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
