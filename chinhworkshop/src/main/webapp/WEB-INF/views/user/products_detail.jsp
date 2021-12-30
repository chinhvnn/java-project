<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/layouts/tablib.jsp" %>

<body>
<div class="container">
  <ul class="breadcrumb">
    <li><a href="home"><i class="fa fa-home"></i></a></li>
    <li><a href="#">${ detailproducts.get(0).name}</a></li>
  </ul>
  <div class="row">
    <!-- Thanh thu muc ben trai -->
    <%@ include file = "/WEB-INF/views/layouts/column-left.jsp" %>
    <div id="content" class="col-sm-9">
      <div class="row">
        <div class="col-sm-6">
          <div class="thumbnails">
            <div><a class="thumbnail" href="resources/image/product/product8.jpg" title="lorem ippsum dolor dummy"><img src="resources/image/product/product1.jpg" title="lorem ippsum dolor dummy" alt="lorem ippsum dolor dummy" /></a></div>
            <div id="product-thumbnail" class="owl-carousel">
              <div class="item">
                <div class="image-additional"><a class="thumbnail  " href="resources/image/product/product1.jpg" title="lorem ippsum dolor dummy"> <img src="resources/image/product/pro-2-220x294.jpg" title="lorem ippsum dolor dummy" alt="lorem ippsum dolor dummy" /></a></div>
              </div>
              <div class="item">
                <div class="image-additional"><a class="thumbnail  " href="resources/image/product/product2.jpg" title="lorem ippsum dolor dummy"> <img src="resources/image/product/pro-2-220x294.jpg" title="lorem ippsum dolor dummy" alt="lorem ippsum dolor dummy" /></a></div>
              </div>
              <div class="item">
                <div class="image-additional"><a class="thumbnail  " href="resources/image/product/product3.jpg" title="lorem ippsum dolor dummy"> <img src="resources/image/product/pro-3-220x294.jpg" title="lorem ippsum dolor dummy" alt="lorem ippsum dolor dummy" /></a></div>
              </div>
              <div class="item">
                <div class="image-additional"><a class="thumbnail  " href="resources/image/product/product4.jpg" title="lorem ippsum dolor dummy"> <img src="resources/image/product/pro-4-220x294.jpg" title="lorem ippsum dolor dummy" alt="lorem ippsum dolor dummy" /></a></div>
              </div>
              <div class="item">
                <div class="image-additional"><a class="thumbnail  " href="resources/image/product/product5.jpg" title="lorem ippsum dolor dummy"> <img src="resources/image/product/pro-5-220x294.jpg" title="lorem ippsum dolor dummy" alt="lorem ippsum dolor dummy" /></a></div>
              </div>
              <div class="item">
                <div class="image-additional"><a class="thumbnail  " href="resources/image/product/product6.jpg" title="lorem ippsum dolor dummy"> <img src="resources/image/product/pro-6-220x294.jpg" title="lorem ippsum dolor dummy" alt="lorem ippsum dolor dummy" /></a></div>
              </div>
              <div class="item">
                <div class="image-additional"><a class="thumbnail  " href="resources/image/product/product7.jpg" title="lorem ippsum dolor dummy"> <img src="resources/image/product/pro-7-220x294.jpg" title="lorem ippsum dolor dummy" alt="lorem ippsum dolor dummy" /></a></div>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-6">
          <h1 class="productpage-title">${ detailproducts.get(0).name}</h1>
          <div class="rating product"> <span class="fa fa-stack"><i class="fa fa-star fa-stack-1x"></i><i class="fa fa-star-o fa-stack-1x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-1x"></i><i class="fa fa-star-o fa-stack-1x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-1x"></i><i class="fa fa-star-o fa-stack-1x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-1x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-1x"></i></span> <span class="review-count"> <a href="#" onClick="$('a[href=\'#tab-review\']').trigger('click'); return false;">1 reviews</a> / <a href="#" onClick="$('a[href=\'#tab-review\']').trigger('click'); return false;">Write a review</a></span>
            <hr>
            <!-- AddThis Button BEGIN -->
            <div class="addthis_toolbox addthis_default_style"><a class="addthis_button_facebook_like" ></a> <a class="addthis_button_tweet"></a> <a class="addthis_button_pinterest_pinit"></a> <a class="addthis_counter addthis_pill_style"></a></div>
            <!-- AddThis Button END -->
          </div>
          <ul class="list-unstyled productinfo-details-top">
            <li>
              <h2 class="productpage-price"><fmt:formatNumber type="number" groupingUsed="true" value="${ detailproducts.get(0).price}"/> ₫</h2>
            </li>
            <li><span class="productinfo-tax">Ex Tax: $100.00</span></li>
          </ul>
          <hr>
          <ul class="list-unstyled product_info">
            <li>
              <label>Brand:</label>
              <span> <a href="#">${ detailproducts.get(0).id_brand}</a></span></li>
            <li>
              <label>Product Code:</label>
              <span> sp${ detailproducts.get(0).id_product}</span></li>
            <li>
              <label>Availability:</label>
              <span> In Stock</span></li>
          </ul>
          <hr>
          <p class="product-desc"> ${ detailproducts.get(0).detail}</p>
          <div id="product">
            <div class="form-group">
              <label class="control-label qty-label" for="input-quantity">Qty</label>
              <input type="text" name="quantity" value="1" size="2" id="input-quantity" class="form-control productpage-qty" />
              <input type="hidden" name="product_id" value="48" />
              <div class="btn-group">
                <button type="button" data-toggle="tooltip" class="btn btn-default wishlist" title="Add to Wish List" ><i class="fa fa-heart-o"></i></button>
                <button type="button" id="button-cart" data-loading-text="Loading..." class="btn btn-primary btn-lg btn-block addtocart">Add to Cart</button>
                <button type="button" data-toggle="tooltip" class="btn btn-default compare" title="Compare this Product" ><i class="fa fa-exchange"></i></button>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="productinfo-tab">
        <ul class="nav nav-tabs">
          <li class="active"><a href="#tab-description" data-toggle="tab">Description</a></li>
          <li><a href="#tab-review" data-toggle="tab">Reviews (1)</a></li>
        </ul>
        <div class="tab-content">
          <div class="tab-pane active" id="tab-description">
            <div class="cpt_product_description ">
              <div>
                <p> <strong>More room to move.</strong></p>
                <p> With 80GB or 160GB of storage and up to 40 hours of battery life, the new lorem ippsum dolor dummy lets you enjoy up to 40,000 songs or up to 200 hours of video or any combination wherever you go.</p>
                <p> <strong>Cover Flow.</strong></p>
                <p> Browse through your music collection by flipping through album art. Select an album to turn it over and see the track list.</p>
                <p> <strong>Enhanced interface.</strong></p>
                <p> Experience a whole new way to browse and view your music and video.</p>
                <p> <strong>Sleeker design.</strong></p>
                <p> Beautiful, durable, and sleeker than ever, lorem ippsum dolor dummy now features an anodized aluminum and polished stainless steel enclosure with rounded edges.</p>
              </div>
            </div>
            <!-- cpt_container_end --></div>
          <div class="tab-pane" id="tab-review">
            <form class="form-horizontal">
              <div id="review"></div>
              <h2>Write a review</h2>
              <div class="form-group required">
                <div class="col-sm-12">
                  <label class="control-label" for="input-name">Your Name</label>
                  <input type="text" name="name" value="" id="input-name" class="form-control" />
                </div>
              </div>
              <div class="form-group required">
                <div class="col-sm-12">
                  <label class="control-label" for="input-review">Your Review</label>
                  <textarea name="text" rows="5" id="input-review" class="form-control"></textarea>
                  <div class="help-block"><span class="text-danger">Note:</span> HTML is not translated!</div>
                </div>
              </div>
              <div class="form-group required">
                <div class="col-sm-12">
                  <label class="control-label">Rating</label>
                  &nbsp;&nbsp;&nbsp; Bad&nbsp;
                  <input type="radio" name="rating" value="1" />
                  &nbsp;
                  <input type="radio" name="rating" value="2" />
                  &nbsp;
                  <input type="radio" name="rating" value="3" />
                  &nbsp;
                  <input type="radio" name="rating" value="4" />
                  &nbsp;
                  <input type="radio" name="rating" value="5" />
                  &nbsp;Good</div>
              </div>
              <div class="buttons clearfix">
                <div class="pull-right">
                  <button type="button" id="button-review" data-loading-text="Loading..." class="btn btn-primary">Continue</button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
      <h3 class="productblock-title">SẢN PHẨM LIÊN QUAN</h3>
      <div class="box">
        <div id="related-slidertab" class="row owl-carousel product-slider">
        <c:forEach items="${bestproducts}" var="item">
          <div class="item">
            <div class="product-thumb transition">
              <div class="image product-imageblock"> <a href="#"> <img src="resources/image/product/pro-3-220x294.jpg" alt="women's New Wine is an alcoholic" title="women's New Wine is an alcoholic" class="img-responsive" /> </a>
                <div class="button-group">
                  <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List"><i class="fa fa-heart-o"></i></button>
                  <button type="button" class="addtocart-btn">Add to Cart</button>
                  <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product"><i class="fa fa-exchange"></i></button>
                </div>
              </div>
              <div class="caption product-detail">
                <h4 class="product-name"><a href="product.html" title="${item.name}">${item.name}</a></h4>
                <p class="price product-price"> <span class="price-new"><fmt:formatNumber type="number" groupingUsed="true" value="${ item.price}"/> ₫</span> <span class="price-old">$272.00</span> <span class="price-tax">Ex Tax: $210.00</span> </p>
              </div>
              <div class="button-group">
                <button type="button" class="wishlist" data-toggle="tooltip" title="Add to Wish List"><i class="fa fa-heart-o"></i></button>
                <button type="button" class="addtocart-btn">Add to Cart</button>
                <button type="button" class="compare" data-toggle="tooltip" title="Compare this Product"><i class="fa fa-exchange"></i></button>
              </div>
            </div>
          </div>
          </c:forEach>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
