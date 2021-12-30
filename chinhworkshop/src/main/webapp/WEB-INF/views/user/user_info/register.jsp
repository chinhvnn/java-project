<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/layouts/tablib.jsp" %>


<body>
<div class="container">
  <ul class="breadcrumb">
    <li><a href="home"><i class="fa fa-home"></i></a></li>
    <li><a href="#">LOGIN</a></li>
  </ul>
  <div class="row">
    <!-- Thanh thu muc ben trai -->
    <%@ include file = "/WEB-INF/views/layouts/column-left.jsp" %>
    <div id="content" class="col-sm-9">
    <c:if test="${not empty LoginSuccess }">
	 <div class="container">
	  <div class="row">
	    <div class="col-sm-12" id="content">
	      <div class="row">
	        <div class="col-sm-12">
	          <div class="well">
	            <h2>You are already logged in. Please click <a href="home">HERE</a> to return to the website.</h2>
	            </div>
	        </div>
	      </div>
	    </div>
	  </div>
	</div>
	</c:if>
	<c:if test="${empty LoginSuccess }">
	 <div class="container">
	  <div class="row">
	    <div class="col-sm-9" id="content">
            <h1>Register Account</h1>
            <p>If you already have an account with us, please login at the <a href="login">login page</a>.</p>
            <form:form class="form-horizontal" method="POST" action="register" modelAttribute="user">
            	<div style="color:red">${status }</div>
                <fieldset id="account">
                    <legend>Your Personal Details</legend>
                    <div class="form-group required">
                        <label for="input-firstname" class="col-sm-2 control-label">User Name</label>
                        <div class="col-sm-10">
                            <form:input path="user_name" type="text" class="form-control" id="input-firstname" placeholder="User Name"/>
                        </div>
                    </div>
                    <div class="form-group required">
                        <label for="input-email" class="col-sm-2 control-label">E-Mail</label>
                        <div class="col-sm-10">
                            <form:input path="email" type="email" class="form-control" id="input-email" placeholder="E-Mail"/>
                        </div>
                    </div>
                </fieldset>
                <fieldset id="address">
                    <legend>Your Address</legend>
                    <div class="form-group required">
                        <label for="input-address-1" class="col-sm-2 control-label">Address</label>
                        <div class="col-sm-10">
                            <form:input path="address" type="text" class="form-control" id="input-address-1" placeholder="Address"/>
                        </div>
                    </div>
                </fieldset>
                <fieldset>
                    <legend>Your Password</legend>
                    <div class="form-group required">
                        <label for="input-password" class="col-sm-2 control-label">Password</label>
                        <div class="col-sm-10">
                            <form:input path="password" type="password" class="form-control" id="input-password" placeholder="Password"/>
                        </div>
                    </div>
                    <div class="form-group required">
                        <label for="input-confirm" class="col-sm-2 control-label">PasswordConfirm</label>
                        <div class="col-sm-10">
                            <form:input path="password" type="password" class="form-control" id="input-password" placeholder="Password Confirm"/>
                        </div>
                    </div>
                </fieldset>
                <fieldset>
                </fieldset>
                <div class="buttons">
                    <div class="pull-right">I have read and agree to the <a class="agree" href="#"><b>Privacy Policy</b></a>
                        <input type="checkbox" value="1" name="agree">
                        &nbsp;
                        <input type="submit" class="btn btn-primary" value="register">
                    </div>
                </div>
            </form:form>
       	  </div>
        </div>
      </div>
      </c:if>
    </div>
  </div>
</div>
</body>