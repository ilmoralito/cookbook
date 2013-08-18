<!doctype html>
  <fieldset>
    <legend><g:message code="ni.com.cookbook.createuser"/></legend>
    
    <div class="form-group">
      <label for="fullName"><g:message code="ni.com.cookbook.fullname"/></label>
      <g:textField type="text" class="form-control" name="fullName" placeholder="${message(code:'ni.com.cookbook.fullname')}"/>
    </div>

    <div class="form-group">
      <label for="email"><g:message code="ni.com.cookbook.email"/></label>
      <g:textField type="text" class="form-control" name="email" placeholder="${message(code:'ni.com.cookbook.email')}"/>
    </div>

    <div class="form-group">
      <label for="password"><g:message code="ni.com.cookbook.password"/></label>
      <g:passwordField class="form-control" name="password" placeholder="${message(code:'ni.com.cookbook.password')}"/>
    </div>

     <div class="form-group">
      <label for="passconfirm"><g:message code="ni.com.cookbook.confirmpass"/></label>
      <g:passwordField class="form-control" name="passconfirm" placeholder="${message(code:'ni.com.cookbook.confirmpass')}"/>
    </div>

    <g:if test="${session.user=='admin'}">
      <div class="form-group">
        <label for="role"><g:message code="ni.com.cookbook.role"/></label>
        <g:select name="role" from="${userInstance.constraints.role.inList}" value="${userInstance?.role}" valueMessagePrefix="teachers.role"/>
      </div>

      <div class="form-group">
        <label class="radio">
          <g:message code="ni.com.cookbook.enable"/>
          <g:radio name="enable" id="" value="true"/>
          </label>
      </div>

       <div class="form-group">
        <label class="radio">
          <g:message code="ni.com.cookbook.disable"/>
          <g:radio name="enable" id="" value="false" checked="true"/>
         </label>
      </div>
    </g:if>

     
    
    <g:submitButton name="btnregistration" value="${message(code:'ni.com.cookbook.btnsave')}"class="btn btn-default"/>
    
    <g:link controller="user" action="login" class="btn btn-info loco"> 
      <g:message code="ni.com.cookbook.login"/>
    </g:link>   

    </fieldset>


