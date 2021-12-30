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
	      <div class="row">
	        <div class="col-sm-6">
	          <div class="well">
	            <h2>New Customer</h2>
	            <p><strong>Register Account</strong></p>
	            <p>By creating an account you will be able to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.</p>
	            <a class="btn btn-primary" href="register">Continue</a></div>
	        </div>
	        <div class="col-sm-6">
	          <div class="well">
	            <h2>Returning Customer</h2>
	            <p>${ status }</p>
	            <p><strong>I am a returning customer</strong></p>
	            <form:form action="login" method="POST" modelAttribute="user">
	              <div class="form-group">
	                <label class="control-label">E-Mail Address</label>
	                <form:input class="form-control" id="input-email" placeholder="E-Mail Address" value="" path="email"/>
	              </div>
	              <div class="form-group">
	                <label for="input-password" class="control-label">Password</label>
	                <form:input type="password" class="form-control" id="input-password" placeholder="Password" value="" path="password"/>
	                <a href="forgetpassword">Forgotten Password</a></div>
	              <input type="submit" class="btn btn-primary" value="login" name="request">
	            </form:form>
	          </div>
	        </div>
	      </div>
	    </div>
	  </div>
	</div>
	</c:if>
    </div>
  </div>
</div>
</body>