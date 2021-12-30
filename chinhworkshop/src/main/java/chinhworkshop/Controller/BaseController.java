// khai bao thu vien co so dung chung
package chinhworkshop.Controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import chinhworkshop.Services.AccountService_Imple;
import chinhworkshop.Services.CartService_Imple;
import chinhworkshop.Services.HomeService_Imple;

@Controller
public abstract class BaseController {
	@Autowired
	HomeService_Imple _homeservice;
	@Autowired
	AccountService_Imple _accountservice;
	@Autowired
	CartService_Imple _cartService;
	
	ModelAndView _mvShare = new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init() {
		_mvShare.addObject("menus", _homeservice.GetsDataMenus());
		_mvShare.addObject("brands", _homeservice.GetsDataBrands());
		_mvShare.addObject("bestproducts", _homeservice.GetsBestProducts());
		
		return _mvShare;
	}
}	
