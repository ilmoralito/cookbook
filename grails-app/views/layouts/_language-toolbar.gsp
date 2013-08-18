<!DOCTYPE html>
<g:if test="${controllerName == 'user' && actionName=='create'}">
	<li><g:link params="[lang:"es"]" action="create">${message(code:'ni.com.cookbook.spanish')}</g:link> </li>
	<li><g:link params="[lang:"en"]" action="create">${message(code:'ni.com.cookbook.english')}</g:link></li>
</g:if>

<g:if test="${controllerName == 'user' && actionName=='login'}">
	<li><g:link params="[lang:"es"]" action="login">${message(code:'ni.com.cookbook.spanish')}</g:link> </li>
	<li><g:link params="[lang:"en"]" action="login">${message(code:'ni.com.cookbook.english')}</g:link></li>
</g:if>