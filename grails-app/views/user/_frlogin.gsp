<!doctype html>
<form>
  <fieldset>
    <legend><g:message code="ni.com.cookbook.login"/></legend>
    
    <div class="form-group">
      <label for="exampleInputEmail"><g:message code="ni.com.cookbook.email"/></label>
      <input type="text" class="form-control" id="exampleInputEmail" placeholder="${message(code:'ni.com.cookbook.email')}">
    </div>

    <div class="form-group">
      <label for="exampleInputPassword"><g:message code="ni.com.cookbook.password"/></label>
      <input type="password" class="form-control" id="exampleInputPassword" placeholder="${message(code:'ni.com.cookbook.password')}">
    </div>

    <div class="form-group">
      <g:link controller="login" action="edit" id="" title="${message(code:'org.inrma.edit')}"  class="tooledit">
          <g:message code="ni.com.cookbook.forgotpassword"/>
      </g:link>
    </div>

    <button type="submit" class="btn btn-default">
        <g:message code="ni.com.cookbook.btnlogin"/>
    </button>

    <g:link controller="user" action="create" class="btn btn-info"> 
      <g:message code="ni.com.cookbook.btnregistration"/>
    </g:link>  
  </fieldset>
</form>

