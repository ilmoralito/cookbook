<!doctype html>
<form>
  <fieldset>
    <legend><g:message code="ni.com.cookbook.createuser"/></legend>
    
    <div class="form-group">
      <label for="fullname"><g:message code="ni.com.cookbook.fullname"/></label>
      <input type="text" class="form-control" id="fullname" placeholder="${message(code:'ni.com.cookbook.fullname')}">
    </div>

    <div class="form-group">
      <label for="email"><g:message code="ni.com.cookbook.email"/></label>
      <input type="text" class="form-control" id="email" placeholder="${message(code:'ni.com.cookbook.email')}">
    </div>

    <div class="form-group">
      <label for="password"><g:message code="ni.com.cookbook.password"/></label>
      <input type="password" class="form-control" id="password" placeholder="${message(code:'ni.com.cookbook.password')}">
    </div>

     <div class="form-group">
      <label for="password"><g:message code="ni.com.cookbook.role"/></label>
      <g:select name="role" from="${userInstance.constraints.role.inList}" value="${userInstance?.role}" valueMessagePrefix="teachers.role"/>
    </div>

    <div class="form-group">
      <label class="radio">
        <g:message code="ni.com.cookbook.enable"/>
        <g:radio name="enabled" id="" value="true"/>
        </label>
    </div>

     <div class="form-group">
      <label class="radio">
        <g:message code="ni.com.cookbook.disable"/>
        <g:radio name="enabled" id="" value="false" checked="true"/>
       </label>
    </div>
    
    <g:submitButton name="btnregistration" value="${message(code:'ni.com.cookbook.btnregistration')}"class="btn btn-default"/>
    
    <g:link controller="user" action="login" class="btn btn-info"> 
      <g:message code="ni.com.cookbook.login"/>
    </g:link>   

    </fieldset>
</form>

