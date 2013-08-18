<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>login</title>
	<meta name="layout" content="login">
	<r:require modules="bootstrap,application"/>
</head>
<body>
	<g:form  controller= "user" action="authenticate" class="form-inline">
		<g:render template="frlogin"/>
	</g:form>
	
</body>
</html>