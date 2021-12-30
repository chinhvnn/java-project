<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/layouts/tablib.jsp" %>

	<div id="column-left" class="col-sm-3 hidden-xs column-left">
      <%-- <div class="column-block">
        <div class="columnblock-title">Categories</div>
        <div class="category_block">
        
        <c:forEach var="item" items="${ brands }">
         <ul class="box-category treeview-list treeview">
         <li><a href="collection-brand${ item.id }" class="activSub">${ item.brand_name }</a></li>
         </ul>
        </c:forEach>
        </div>
      </div> --%>
      
      <form action="filter-page1&show8&sort1">
      <div class="panel panel-default filter">
        <div class="panel-heading columnblock-title">TÙY CHỌN TÌM KIẾM</div>
        <div class="filter-block">
          <div class="list-group">
          	<a class="list-group-item">THƯƠNG HIỆU</a>
            <div class="list-group-item">
              <div id="filter-group2">
              <c:forEach var="item" items="${ brands }">
              <label class="checkbox">
                <input name="brand" type="checkbox" value="${ item.id }" />
                 ${ item.brand_name }</label>
		        </c:forEach>
              </div>
            </div>
            <a class="list-group-item">GIÁ</a>
            <div class="list-group-item">
              <div id="filter-group2">
                <label class="checkbox">
                  <input name="price" type="checkbox" value="below2m" />
                  Dưới 2 triệu</label>
                <label class="checkbox">
                  <input name="price" type="checkbox" value="2m-4m" />
                  2 triệu - 4 triệu</label>
                  <label class="checkbox">
                  <input name="price" type="checkbox" value="above4m" />
                  Trên 4 triệu</label>
              </div>
            </div>
            <a class="list-group-item">ĐƯỜNG KÍNH MẶT</a>
            <div class="list-group-item">
              <div id="filter-group3">
                <label class="checkbox">
                  <input name="size" type="checkbox" value="below40" />
                  Dưới 40mm</label>
                <label class="checkbox">
                  <input name="size" type="checkbox" value="40-42" />
                  40mm - 42mm</label>
                <label class="checkbox">
                  <input name="size" type="checkbox" value="above42" />
                  Lớn hơn 42mm</label>
              </div>
            </div>
          </div>
          <div class="panel-footer text-right">
            <button type="submit" id="button-filter" class="btn btn-primary">Refine Search</button>
          </div>
        </div>
      </div>
      </form>
      <div class="banner" >
        <div class="item"> <a href="#"><img src="resources/image/banners/LeftBanner.jpg" alt="Left Banner" class="img-responsive" /></a> </div>
      </div>
      <h3 class="productblock-title">BÁN CHẠY</h3>
      <div class="row special-grid product-grid">
      <c:forEach begin="0" end="2" items="${ bestproducts }" var="item">
      <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 product-grid-item">
          <div class="product-thumb transition">
            <div class="image product-imageblock"> <a href="#"><img src="resources/image/product/5product50x59.jpg" alt="women's New Wine is an alcoholic" title="women's New Wine is an alcoholic" class="img-responsive" /></a>
              <div class="button-group">
                <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                <button type="button" class="addtocart-btn" >Add to Cart</button>
                <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
              </div>
            </div>
            <div class="caption product-detail">
              <h4 class="product-name"> <a href="product.html" title="$ {item.name}">${item.name}</a> </h4>
              <p class="price product-price"> <span class="price-new"><fmt:formatNumber type="number" groupingUsed="true" value="${item.price}"/> ₫ </span><span class="price-tax">Ex Tax: $210.00</span> </p>
            </div>
            <div class="button-group">
              <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
              <button type="button" class="addtocart-btn" >Add to Cart</button>
              <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
            </div>
          </div>
        </div>
      </c:forEach>
      </div>
    </div>