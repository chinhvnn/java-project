package chinhworkshop.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController extends BaseController {

	// mapping vao trang san pham
	@RequestMapping(value = { "/collection-page{pageId}&show{itemPerPage}&sort{sort}" })
	public ModelAndView collection(@PathVariable String pageId, @PathVariable String itemPerPage,@PathVariable String sort) {
		_mvShare.setViewName("user/collection");
		_mvShare.addObject("newproducts", _homeservice.GetsNewProducts());
		_mvShare.addObject("saleproducts", _homeservice.GetsSaleProducts());
		
		_mvShare.addObject("pageId", pageId);
		_mvShare.addObject("itemPerPage", itemPerPage);
		_mvShare.addObject("sort", sort);
		
		int totalPage = (_homeservice.GetsAllProducts().size())/(Integer.parseInt(itemPerPage)) + 1;
		_mvShare.addObject("paginates", _homeservice.totalPagePaginates(totalPage));
		_mvShare.addObject("allproducts", _homeservice.GetsAllProducts());
		_mvShare.addObject("products", _homeservice.GetsDataProducts(pageId, itemPerPage, sort));
		
		return _mvShare;
		
	}

	// mapping trang LOC SAN PHAM
	@RequestMapping(value = { "/filter-page{pageId}&show{itemPerPage}&sort{sort}" })
	public ModelAndView filter(HttpServletRequest filter_rq, @PathVariable String pageId, @PathVariable String itemPerPage,@PathVariable String sort ) {
		String[] brand_str = filter_rq.getParameterValues("brand");
		String[] price_str = filter_rq.getParameterValues("price");
		String[] size_str = filter_rq.getParameterValues("size");
		
		_mvShare.addObject("pageId", pageId);
		_mvShare.addObject("itemPerPage", itemPerPage);
		_mvShare.addObject("sort", sort);
		_mvShare.addObject("urlFilter", _homeservice.urlFilter(brand_str, price_str, size_str));
		
		int totalPage = (_homeservice.FilterAllProducts(brand_str, price_str, size_str, pageId, itemPerPage, sort).size())/(Integer.parseInt(itemPerPage)) + 1;
		_mvShare.addObject("paginates", _homeservice.totalPagePaginates(totalPage));
		_mvShare.addObject("allfilter_products", _homeservice.FilterAllProducts(brand_str, price_str, size_str, pageId, itemPerPage, sort));
		_mvShare.addObject("filter_products", _homeservice.FilterProducts(brand_str, price_str, size_str, pageId, itemPerPage, sort));
		
		_mvShare.setViewName("user/products_filter");
		return _mvShare;
	}
	// mapping vao chi tiet san pham
		@RequestMapping(value = { "/detail{id_product}" })
		public ModelAndView detailProduct(@PathVariable String id_product) {
			_mvShare.setViewName("user/products_detail");
			_mvShare.addObject("id_product", id_product);
			_mvShare.addObject("detailproducts", _homeservice.GetDetailProduct(id_product));
			
			return _mvShare;
			
		}
	
}