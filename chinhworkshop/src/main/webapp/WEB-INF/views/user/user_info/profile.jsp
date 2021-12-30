<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/layouts/tablib.jsp" %>


<body>
<div class="container">
  <ul class="breadcrumb">
    <li><a href="home"><i class="fa fa-home"></i></a></li>
    <li><a href="#">THÔNG TIN TÀI KHOẢN</a></li>
  </ul>
  <div class="row">
    <!-- Thanh thu muc ben trai -->
    <%@ include file = "/WEB-INF/views/layouts/column-left-profile.jsp" %>
    <div id="content" class="col-sm-9">
    <c:if test="${empty LoginSuccess }">
	 <div class="container">
	  <div class="row">
	    <div class="col-sm-12" id="content">
	      <div class="row">
	        <div class="col-sm-12">
	          <div class="well">
	            <h2>Bạn chưa đăng nhập. Please click <a href="login">HERE</a> to go to the login.</h2>
	            </div>
	        </div>
	      </div>
	    </div>
	  </div>
	</div>
	</c:if>
	<c:if test="${not empty LoginSuccess }">
	 <div class="container">
	  <div class="row">
	    <div class="col-sm-9" id="content">
            <h1>THÔNG TIN TÀI KHOẢN</h1>
                <fieldset id="account">
                    <legend>Your Personal Details</legend>
                    <div class="form-group required">
                        <label for="input-firstname" class="col-sm-2 control-label">User Name</label>
                        <label for="input-firstname" class="col-sm-10 control-label"> ${LoginSuccess.user_name}</label>
                    </div>
                    <div class="form-group required">
                        <label for="input-email" class="col-sm-2 control-label">E-Mail</label>
                      	<label for="input-firstname" class="col-sm-10 control-label"> ${LoginSuccess.email}</label>
                    </div>
                </fieldset>
                <fieldset id="address">
                    <legend>Your Address</legend>
                    <div class="form-group required">
                        <label for="input-address-1" class="col-sm-2 control-label">Address</label>
                        <label for="input-firstname" class="col-sm-10 control-label"> ${LoginSuccess.address}</label>
                    </div>
                </fieldset>
                <fieldset id="password">
                    <legend>Your Password</legend>
                    <div class="form-group required">
                        <label for="input-address-1" class="col-sm-2 control-label">Change Password</label>
                        <label for="input-firstname" class="col-sm-10 control-label"> <a class="agree" href="#"><b>Click here</b></a></label>
                    </div>
                </fieldset>
       	  </div>
        </div>
      </div>
      </c:if>
    </div>
  </div>
</div>
</body>