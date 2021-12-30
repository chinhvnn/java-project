package chinhworkshop.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {

	// mapping vao trang chu
	@RequestMapping(value = { "/", "/home" })
	public ModelAndView index() {
		_mvShare.setViewName("user/index");
		_mvShare.addObject("slides", _homeservice.GetsDataSlide());
		_mvShare.addObject("newproducts", _homeservice.GetsNewProducts());
		_mvShare.addObject("saleproducts", _homeservice.GetsSaleProducts());
		return _mvShare;
	}

	// mapping trang tim kiem
	@RequestMapping(value = { "/search-page{pageId}&show{itemPerPage}&sort{sort}" })
	public ModelAndView search(HttpServletRequest search_rq, @PathVariable String pageId, @PathVariable String itemPerPage,@PathVariable String sort) {
		String key = search_rq.getParameter("keyword"); // lay keyword tu phia client

		_mvShare.addObject("pageId", pageId);
		_mvShare.addObject("itemPerPage", itemPerPage);
		_mvShare.addObject("sort", sort);
		_mvShare.addObject("urlSearch", ("?keyword=" + key));
		
		int totalPage = (_homeservice.GetSearchAllProducts(key).size())/(Integer.parseInt(itemPerPage)) + 1;
		_mvShare.addObject("paginates", _homeservice.totalPagePaginates(totalPage));
		_mvShare.addObject("allsearch_products", _homeservice.GetSearchAllProducts(key));
		_mvShare.addObject("search_products", _homeservice.GetSearchProducts(key, pageId, itemPerPage, sort));
		
		_mvShare.setViewName("user/products_search");
		return _mvShare;
	}
}