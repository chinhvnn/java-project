<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/layouts/tablib.jsp" %>

<body>
<div class="container">
  <ul class="breadcrumb">
    <li><a href="home"><i class="fa fa-home"></i></a></li>
    <li><a href="#">THANH TOÁN</a></li>
  </ul>
  <div class="row">
    <!-- Thanh thu muc ben trai -->
    <%@ include file = "/WEB-INF/views/layouts/column-left-profile.jsp" %>
    
    
    <div class="col-sm-9" id="content">
      <h1>Check Out </h1>
      <form enctype="multipart/form-data" method="post" action="#">
        <div class="table-responsive">
          <table class="table table-bordered">
            <thead>
              <tr>
                <td class="text-center">Image</td>
                <td class="text-left">Product Name</td>
                <td class="text-left">Model</td>
                <td class="text-left">Quantity</td>
                <td class="text-right">Unit Price</td>
                <td class="text-right">Total</td>
              </tr>
            </thead>
            <tbody>
            <c:if test="${empty shoppingcart}"> 
              <tr>
              <td></td>
                <td class="text-left"><p>Không có sản phẩm nào trong giỏ hàng</p></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
              </tr>
              </c:if>
            <c:forEach items="${shoppingcart}" var="item">
              <tr>
                <td class="text-center"><a href="detail${item.value.product.id_product}"><img class="img-thumbnail" title="" alt="" src="resources/image/product/5product50x59.jpg"></a></td>
                <td class="text-left"><a href="detail${item.value.product.id_product}">${item.value.product.name}</a></td>
                <td class="text-left"> <p>SP${item.value.product.id_product}</p></td>
                <td class="text-left"> <p>${item.value.quatity}</p></td>
                <td class="text-right"><fmt:formatNumber type="number" groupingUsed="true" value="${item.value.product.price}"/> đ</td>
                <td class="text-right"><fmt:formatNumber type="number" groupingUsed="true" value="${item.value.totalPrice}" />đ</td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </form>
	  <form:form class="form-horizontal" method="POST" modelAttribute="user">
      <div id="accordion" class="panel-group">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h4 class="panel-title">Estimate Shipping &amp; Taxes </h4>
          </div>
            <div class="panel-body">
              <p>Enter your destination to get a shipping estimate.</p>
              <div class="form-group required">
                  <label for="input-country" class="col-sm-2 control-label">Tên người nhận:</label>
                  <div class="col-sm-10">
                   <form:input path="user_name" class="form-control" value="${LoginSuccess.user_name}"/>
               		</div>
                </div>
                <div class="form-group required">
                  <label for="input-country" class="col-sm-2 control-label">Địa điểm</label>
                  <div class="col-sm-10">
                    <select class="form-control" id="input-country" name="country_id">
                      <option value=""> --- Please Select --- </option>
                      <option value="1">Đà Nẵng</option>
                      <option value="2">Các tỉnh khác</option>
                    </select>
                  </div>
                </div>
                <div class="form-group required">
                  <label for="input-zone" class="col-sm-2 control-label">Địa chỉ nhà</label>
                  <div class="col-sm-10">
                   <input id="input-address-1" name="address" type="text" class="form-control" value="${LoginSuccess.address}"/>
                  </div>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
          <div class="panel-heading">
            <h4 class="panel-title"><a class="accordion-toggle" data-parent="#accordion" data-toggle="collapse" href="#collapse-voucher">Use Gift Voucher <i class="fa fa-caret-down"></i></a></h4>
          </div>
          <div class="panel-collapse collapse" id="collapse-voucher">
            <div class="panel-body">
              <label for="input-voucher" class="col-sm-3 control-label">Enter your gift voucher code here</label>
              <div class="input-group">
                <input type="text" class="form-control" id="input-voucher" placeholder="Enter your gift voucher code here" value="" name="voucher">
                <span class="input-group-btn">
                <input type="submit" class="btn btn-primary" data-loading-text="Loading..." id="button-voucher" value="Apply Voucher">
                </span> </div>
            </div>
          </div>
        </div>
      </div>
      <br>
      <div class="row">
        <div class="col-sm-4 col-sm-offset-8">
          <table class="table table-bordered">
            <tbody>
              <tr>
                <td class="text-right"><strong>Sub-Total:</strong></td>
                <td class="text-right"><fmt:formatNumber type="number" groupingUsed="true" value="${totalPriceBill}"/> đ</td>
              </tr>
              <tr>
                <td class="text-right"><strong>Ship Fee:</strong></td>
                <td class="text-right">0 đ</td>
              </tr>
              <tr>
                <td class="text-right"><strong>Gif voucher:</strong></td>
                <td class="text-right">0 đ</td>
              </tr>
              <tr>
                <td class="text-right"><strong>Total:</strong></td>
                <td class="text-right"><fmt:formatNumber type="number" groupingUsed="true" value="${totalPriceBill}"/> đ</td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
      <div class="buttons">
        <div class="pull-left"><a class="btn btn-default" href="home">Continue Shopping</a></div>
        <div class="pull-right"><button class="btn btn-primary" type="submit" name="checkout_rq" value="ok">Confirm Order</button></div>
      </div>
     </form:form>
    </div>
    
  </div>
</div>
</body>
<content tag="script">
	<script>
	</script>
</content>
