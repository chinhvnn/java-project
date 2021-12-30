<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/layouts/tablib.jsp" %>

<body>
<div class="container">
  <ul class="breadcrumb">
    <li><a href="home"><i class="fa fa-home"></i></a></li>
    <li><a href="#">GIỎ HÀNG</a></li>
  </ul>
  <div class="row">
    <!-- Thanh thu muc ben trai -->
    <%@ include file = "/WEB-INF/views/layouts/column-left-profile.jsp" %>
    
    
    <div class="col-sm-9" id="content">
      <h1>Shopping Cart </h1>
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
                <td class="text-left"><div style="max-width: 200px;" class="input-group btn-block">
                    <input type="number" min="1" max="99" class="form-control quantity" size="1" id ="data-qty-input" value="${item.value.quatity}" name="quantity">
                    <span class="input-group-btn">
                    <button class="btn btn-primary action-update-cart" data-id="${item.key}" data-qty="${item.value.quatity}" data-toggle="tooltip" type="submit" title=""><i class="fa fa-refresh"></i></button>
                    <button class="btn btn-danger action-delete-cart" data-id="${item.key}" data-toggle="tooltip" type="submit"><i class="fa fa-times-circle"></i></button>
                    </span></div></td>
                <td class="text-right"><fmt:formatNumber type="number" groupingUsed="true" value="${item.value.product.price}"/> đ</td>
                <td class="text-right"><fmt:formatNumber type="number" groupingUsed="true" value="${item.value.totalPrice}" />đ</td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </form>
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
        <div class="pull-right"><a class="btn btn-primary" href="checkout">Checkout</a></div>
      </div>
    </div>
    
  </div>
</div>
</body>
<content tag="script">
	<script>
	$(document).on('click', '.action-update-cart', function() {
		var id = $(this).data("id");
		var quatity = $("#data-qty-input").val();
	    window.location = "editcart"+id+"-"+quatity;
	});
	</script>
	<script>
	$(document).on('click', '.action-delete-cart', function() {
		var id = $(this).data("id");
		alert("delete");
	    window.location = "deletecart"+id;
	});
	</script>
</content>
