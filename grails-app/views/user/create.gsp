<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>login</title>
	<meta name="layout" content="create">
	<r:require modules="bootstrap,application"/>
</head>
<body>
	<g:eachError bean="${userInstance}" var="us">
		<li id="er">
			<g:message error="${us}"/>
		</li>
	</g:eachError>
	

	<g:form  controller= "user" action="save" class="form-inline">
		<g:if test="${!session.role=='user'}">
			<g:hiddenField name="role" value="user"/>
		</g:if>
		<g:render template="frcreate"/>
	</g:form>
</html>