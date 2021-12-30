<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/layouts/tablib.jsp" %>

<body>
<div class="container">
  <ul class="breadcrumb">
    <li><a href="home"><i class="fa fa-home"></i></a></li>
    <li><a href="#">ĐƠN HÀNG ĐÃ ĐẶT</a></li>
  </ul>
  <div class="row">
    <!-- Thanh thu muc ben trai -->
    <%@ include file = "/WEB-INF/views/layouts/column-left.jsp" %>
    
    
    <div class="col-sm-9" id="content">
      <h1>Order list </h1>
      <form enctype="multipart/form-data" method="post" action="#">
        <div class="table-responsive">
          <table class="table table-bordered">
            <thead>
              <tr>
                <td class="text-center">Mã đơn</td>
                <td class="text-left">Người nhận</td>
                <td class="text-left">Ngày đặt</td>
                <td class="text-left">Giá trị đơn hàng</td>
                <td class="text-center">Chi tiết đơn hàng</td>
              </tr>
            </thead>
            <tbody>
            <c:forEach items="${order_list}" var="item">
              <tr>
                <td class="text-center"><p>SP${item.id_bill}</p></td>
                <td class="text-left"><p>SP${item.user_name}</p></td>
                <td class="text-left"><p>${item.date_time}</p></td>
                <td class="text-left"><fmt:formatNumber type="number" groupingUsed="true" value="${item.totalPriceBill}" />đ</td>
                <td class="text-center"> <a href="#">Chi tiết</a></td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </form>
      <br>
    </div>
  </div>
</div>
</body>
