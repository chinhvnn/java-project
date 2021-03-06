<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/layouts/tablib.jsp" %>

<body>
<div class="container">
  <div class="mainbanner">
  <div id="main-banner" class="owl-carousel home-slider">
  	<c:forEach var= "item" items="${ slides }" varStatus="index">
		<div class="item"> <a href="${ item.link }"><img src="resources/image/banners/${ item.img }" alt="main-banner${ item.id }" class="img-responsive" /></a> </div>
  	</c:forEach>
    
  </div>
</div>
</div>
<div class="container">
  <div class="row">  
    <div id="brand_carouse" class="owl-carousel brand-logo">
        <div class="item text-center"> <a href="#"><img src="resources/image/brand/brand1.png" alt="Disney" class="img-responsive" /></a> </div>
        <div class="item text-center"> <a href="#"><img src="resources/image/brand/brand2.png" alt="Dell" class="img-responsive" /></a> </div>
        <div class="item text-center"> <a href="#"><img src="resources/image/brand/brand3.png" alt="Harley" class="img-responsive" /></a> </div>
        <div class="item text-center"> <a href="#"><img src="resources/image/brand/brand4.png" alt="Canon" class="img-responsive" /></a> </div>
        <div class="item text-center"> <a href="#"><img src="resources/image/brand/brand5.png" alt="Canon" class="img-responsive" /></a> </div>
        <div class="item text-center"> <a href="#"><img src="resources/image/brand/brand6.png" alt="Canon" class="img-responsive" /></a> </div>
        <div class="item text-center"> <a href="#"><img src="resources/image/brand/brand7.png" alt="Canon" class="img-responsive" /></a> </div>
        <div class="item text-center"> <a href="#"><img src="resources/image/brand/brand8.png" alt="Canon" class="img-responsive" /></a> </div>
        <div class="item text-center"> <a href="#"><img src="resources/image/brand/brand9.png" alt="Canon" class="img-responsive" /></a> </div>
        <div class="item text-center"> <a href="#"><img src="resources/image/brand/brand5.png" alt="Canon" class="img-responsive" /></a> </div>
      </div>
    <div class="cms_banner ">
      <div class="col-md-4 cms-banner-left"> <a href="#"><img alt="#" src="resources/image/banners/subbanner1.jpg"></a> </div>
      <div class="col-md-4 cms-banner-middle"><a href="#"> <img alt="#" src="resources/image/banners/subbanner2.jpg"></a></div>
      <div class="col-md-4 cms-banner-right"> <a href="#"><img alt="#" src="resources/image/banners/subbanner3.jpg"></a> </div>
    </div>
  </div>
  <div class="row">
    <div id="content" class="col-sm-12">
      <div class="customtab">
        <div id="tabs" class="customtab-wrapper">
          <ul class='customtab-inner'>
            <li class='tab'><a href="#tab-latest">S???N PH???M M???I</a></li>
            <!-- <li class='tab'><a href="#tab-special">PHI??N B???N ?????C BI???T GI???I H???N</a></li> -->
           <!--  <li class='tab'><a href="#tab-bestseller">S???N PH???M B??N CH???Y</a></li> -->
          </ul>
        </div>
        <!-- tab-latest-->
        <div id="tab-latest" class="tab-content">
          <div class="box">
            <div id="latest-slidertab" class="row owl-carousel product-slider">
            
            <c:forEach items="${ newproducts }" var = "item">
            	 <div class="item">
                <div class="product-thumb transition">
                  <div class="image product-imageblock"> <a href="detail${ item.id_product }">
                  <img src="resources/image/product/${item.img}" alt="lorem ippsum dolor dummy" title="lorem ippsum dolor dummy" class="img-responsive" /> </a>
                    <div class="button-group">
                      <button type="button" class="wishlist" data-toggle="tooltip" title="Th??m v??o m???c y??u th??ch" ><i class="fa fa-heart-o"></i></button>
                      <button type="button" class="addtocart-btn" >MUA NGAY</button>
                      <button type="button" class="compare" data-toggle="tooltip" title="So s??nh s???n ph???m n??y" ><i class="fa fa-exchange"></i></button>
                    </div>
                  </div>
                  <div class="caption product-detail">
                    <h4 class="product-name"><a href="detail${ item.id_product }" title="${ item.name }">${ item.name }</a></h4>
                    <p class="price product-price"><fmt:formatNumber type="number" groupingUsed="true" value="${item.price}"/> ???    <span class="price-old">272.00 ???</span></p>
                  </div>
                </div>
              </div>
            </c:forEach>
            
            </div>
          </div>
        </div>
        <!-- /tab-latest-->
        <!-- tab-special-->
        <!-- <div id="tab-special" class="tab-content">
          <div class="box">
            <div id="special-slidertab" class="row owl-carousel product-slider">
              /////
            </div>
          </div>
        </div> -->
        <!-- /tab-special-->
        <!-- tab-bestseller-->
        <!-- <div id="tab-bestseller" class="tab-content">
          <div class="box">
            <div id="bestseller-slidertab" class="row owl-carousel product-slider">
			//////
            </div>
          </div>
        </div> -->
      </div>
      
      <h3 class="productblock-title">S???N PH???M B??N CH???Y</h3>
      <div class="box">
        <div id="feature-slider" class="row owl-carousel product-slider">
        
         <c:forEach items="${ bestproducts }" var = "item">
           <div class="item product-slider-item">
            <div class="product-thumb transition">
                  <div class="image product-imageblock"> <a href="detail${ item.id_product }"><img src="resources/image/product/${item.img}" alt="lorem ippsum dolor dummy" title="lorem ippsum dolor dummy" class="img-responsive" /> </a>
                    <div class="button-group">
                      <button type="button" class="wishlist" data-toggle="tooltip" title="Th??m v??o m???c y??u th??ch" ><i class="fa fa-heart-o"></i></button>
                      <button type="button" class="addtocart-btn" >MUA NGAY</button>
                      <button type="button" class="compare" data-toggle="tooltip" title="So s??nh s???n ph???m n??y" ><i class="fa fa-exchange"></i></button>
                    </div>
                  </div>
                  <div class="caption product-detail">
                    <h4 class="product-name"><a href="detail${ item.id_product }" title="${ item.name }">${ item.name }</a></h4>
                    <p class="price product-price"><fmt:formatNumber type="number" groupingUsed="true" value="${item.price}"/> ???    <span class="price-old">272.00 ???</span></p>
                  </div>
                </div>
          </div>
          </c:forEach>
          
        </div>
      </div>
     <h3 class="productblock-title">????NH GI?? KH??CH H??NG</h3>
      <div class="parallax">
        <ul id="testimonial" class="row owl-carousel product-slider">
          <li class="item">
            <div class="panel-default">
              <div class="testimonial-image"><img src="resources/image/t1.jpg" alt="#"></div>
              <div class="testimonial-name"><h2>Janet Wilson</h2></div>
              <div class="testimonial-designation"><p>Web Designer</p></div>
              <div class="testimonial-desc">Rem ipsum doLoremRem ipsum doLorem ipsum ut labore et dolore ma ipsum ut labore et <br> dolore  Rem ipsum doLorem ipsum ut labore et dolore mamagna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing.</div>
            </div>
          </li>
          <li class="item">
            <div class="panel-default">
              <div class="testimonial-image"><img src="resources/image/t2.jpg" alt="#"></div>
              <div class="testimonial-name"><h2>Linda Howard</h2></div>
              <div class="testimonial-designation"><p>Web Deweloper</p></div>
              <div class="testimonial-desc">Rem ipsum doLoremRem ipsum doLorem ipsum ut labore et dolore ma ipsum ut labore et <br> dolore  Rem ipsum doLorem ipsum ut labore et dolore mamagna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing.</div>
            </div>
          </li>
          <li class="item">
            <div class="panel-default">
              <div class="testimonial-image"><img src="resources/image/t3.jpg" alt="#"></div>
              <div class="testimonial-name"><h2>Janet Wilson</h2></div>
              <div class="testimonial-designation"><p>Web Designer</p></div>
              <div class="testimonial-desc">Rem ipsum doLoremRem ipsum doLorem ipsum ut labore et dolore ma ipsum ut labore et <br> dolore  Rem ipsum doLorem ipsum ut labore et dolore mamagna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing.</div>

            </div>
          </li>
          <li class="item">
            <div class="panel-default">
              <div class="testimonial-image"><img src="resources/image/t4.jpg" alt="#"></div>
              <div class="testimonial-name"><h2>Linda Howard</h2></div>
              <div class="testimonial-designation"><p>Web Deweloper</p></div>
              <div class="testimonial-desc">Rem ipsum doLoremRem ipsum doLorem ipsum ut labore et dolore ma ipsum ut labore et <br> dolore  Rem ipsum doLorem ipsum ut labore et dolore mamagna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur adipisicing.</div>

            </div>
          </li>
        </ul>
      </div>
      <div class="blog">
        <div class="blog-heading">
          <h3>Latest Blogs</h3>
        </div>
        <div class="blog-inner box">
          <ul class="list-unstyled blog-wrapper" id="latest-blog">
            <li class="item blog-slider-item">
              <div class="panel-default">
                <div class="blog-image"> <a href="#" class="blog-imagelink"><img src="resources/image/blog/blog_1.jpg" alt="#"></a> <span class="blog-hover"></span> <span class="blog-date">06/07/2015</span> <span class="blog-readmore-outer"><a href="#" class="blog-readmore">Read More</a></span> </div>
                <div class="blog-content"> <a href="#" class="blog-name">
                  <h2>Artisan wines from Napa Valley</h2>
                  </a>
                  <div class="blog-desc">Rem ipsum doLorem ipsum ut labore et dolore magna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur Lorem ipsum doLorem ipsum dolor sit amet doLorem ipsum dolor sit amet adipisicing...</div>
                  <a href="#" class="blog-readmore">Read More</a> <span class="blog-date">06/07/2015</span> </div>
              </div>
            </li>
            <li class="item blog-slider-item">
              <div class="panel-default">
                <div class="blog-image"> <a href="#" class="blog-imagelink"><img src="resources/image/blog/blog_2.jpg" alt="#"></a> <span class="blog-hover"></span> <span class="blog-date">06/07/2015</span> <span class="blog-readmore-outer"><a href="#" class="blog-readmore">Read More</a></span> </div>
                <div class="blog-content"> <a href="#" class="blog-name">
                  <h2>350000+ expert wine ratings</h2>
                  </a>
                  <div class="blog-desc">Rem ipsum doLorem ipsum ut labore et dolore magna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur Lorem ipsum doLorem ipsum dolor sit amet doLorem ipsum dolor sit amet adipisicing...</div>
                  <a href="singale-blog.html" class="blog-readmore">Read More</a> <span class="blog-date">06/07/2015</span> </div>
              </div>
            </li>
            <li class="item blog-slider-item">
              <div class="panel-default">
                <div class="blog-image"> <a href="#" class="blog-imagelink"><img src="resources/image/blog/blog_3.jpg" alt="#"></a> <span class="blog-hover"></span> <span class="blog-date">06/07/2015</span> <span class="blog-readmore-outer"><a href="singale-blog.html" class="blog-readmore">Read More</a></span> </div>
                <div class="blog-content"> <a href="#" class="blog-name">
                  <h2>A large and rich guide to wine</h2>
                  </a>
                  <div class="blog-desc">Rem ipsum doLorem ipsum ut labore et dolore magna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur Lorem ipsum doLorem ipsum dolor sit amet doLorem ipsum dolor sit amet adipisicing...</div>
                  <a href="singale-blog.html" class="blog-readmore">Read More</a> <span class="blog-date">06/07/2015</span> </div>
              </div>
            </li>
            <li class="item blog-slider-item">
              <div class="panel-default">
                <div class="blog-image"> <a href="#" class="blog-imagelink"><img src="resources/image/blog/blog_4.jpg" alt="#"></a> <span class="blog-hover"></span> <span class="blog-date">06/07/2015</span> <span class="blog-readmore-outer"><a href="#" class="blog-readmore">Read More</a></span> </div>
                <div class="blog-content"> <a href="#" class="blog-name">
                  <h2>Have your favorite Wine</h2>
                  </a>
                  <div class="blog-desc">Rem ipsum doLorem ipsum ut labore et dolore magna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur Lorem ipsum doLorem ipsum dolor sit amet doLorem ipsum dolor sit amet adipisicing...</div>
                  <a href="#" class="blog-readmore">Read More</a> <span class="blog-date">06/07/2015</span> </div>
              </div>
            </li>
            <li class="item blog-slider-item">
              <div class="panel-default">
                <div class="blog-image"> <a href="#" class="blog-imagelink"><img src="resources/image/blog/blog_5.jpg" alt="#"></a> <span class="blog-hover"></span> <span class="blog-date">06/07/2015</span> <span class="blog-readmore-outer"><a href="#" class="blog-readmore">Read More</a></span> </div>
                <div class="blog-content"> <a href="#" class="blog-name">
                  <h2>Fast and easy Wine delivery</h2>
                  </a>
                  <div class="blog-desc">Rem ipsum doLorem ipsum ut labore et dolore magna.Lorem ipsum doLorem ipsum dolor sit amet, consectetur Lorem ipsum doLorem ipsum dolor sit amet doLorem ipsum dolor sit amet adipisicing...</div>
                  <a href="#" class="blog-readmore">Read More</a> <span class="blog-date">06/07/2015</span> </div>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <div id="subbanner4" class="banner" >
  <div class="item"> <a href="#"><img src="resources/image/banners/subbanner4.jpg" alt="Sub Banner4" class="img-responsive" /></a> </div>
</div>  
</div>
</body>

