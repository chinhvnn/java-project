<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/layouts/tablib.jsp" %>

<body class="category col-2 left-col">
<div class="preloader loader" style="display: block; background:#f2f2f2;"> <img src="<c:url value="resources/image/loader.gif"/>"  alt="#"/></div>
<div class="container">
  <ul class="breadcrumb">
    <li><a href="./home"><i class="fa fa-home"></i></a></li>
    <li><a href="#">BỘ SƯU TẬP</a></li>
  </ul>
  <div class="row">
  <!-- Thanh thu muc ben trai -->
    <%@ include file = "/WEB-INF/views/layouts/column-left.jsp" %>
    <div id="content" class="col-sm-9">
      <h2 class="category-title">Desktops</h2>
      <div class="row category-banner">
        <div class="col-sm-12 category-image"><img src="resources/image/banners/category-banner.jpg" alt="Desktops" title="Desktops" class="img-thumbnail" /></div>
        <div class="col-sm-12 category-desc">Lorem ipsum dolomagna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate.</div>
      </div>
   <!-- Thanh sap xep -->
     <%@ include file = "/WEB-INF/views/layouts/sort-panel.jsp" %>
      <br />
      <div class="grid-list-wrapper">
      <c:if test="${!empty products}">
      <c:forEach items="${ products }" var="item"> 
		<div class="product-layout product-list col-xs-12">
          <div class="product-thumb">
            <div class="image product-imageblock"> <a href="detail${ item.id_product }"> 
            <img src="resources/image/product/pro-2-220x294.jpg" alt="${ item.name }" title="${ item.name }" class="img-responsive" /> </a>
              <div class="button-group">
                <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List"><i class="fa fa-heart-o"></i></button>
                <button type="button" class="addtocart-btn">Add to Cart</button>
                <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product"><i class="fa fa-exchange"></i></button>
              </div>
            </div>
            <div class="caption product-detail">
              <h4 class="product-name"> <a href="detail${ item.id_product }" title="${ item.name }"> ${ item.name } </a> </h4>
              <p class="product-desc"> 
              ${ item.detail }
              </p>
              <p class="price product-price"><span class="price-old">$272.00</span>      <fmt:formatNumber type="number" groupingUsed="true" value="${item.price}"/> ₫    <span class="price-tax">Ex Tax: $100.00</span> </p>
              <div class="rating"> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span> </div>
            </div>
            <div class="button-group">
              <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List"><i class="fa fa-heart-o"></i></button>
              <a href="AddCart${ item.id_product }"><button type="button" class="addtocart-btn">Add to Cart</button></a>
              <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product"><i class="fa fa-exchange"></i></button>
            </div>
          </div>
        </div>      
      </c:forEach>
      </c:if>
            
      </div>
      <%@ include file = "/WEB-INF/views/layouts/pagination.jsp" %>
    </div>
  </div>
</div>
</body>