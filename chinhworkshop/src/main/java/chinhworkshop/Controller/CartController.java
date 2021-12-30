package chinhworkshop.Controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import chinhworkshop.DTO.BillsDTO;
import chinhworkshop.DTO.CartDTO;
import chinhworkshop.Entity.User_setget;

@Controller
public class CartController extends BaseController {

	@RequestMapping(value = "/cart")
	public ModelAndView Cart(HttpSession session) {
		_mvShare.setViewName("user/cart/cart");
		@SuppressWarnings("unchecked")
		HashMap<Integer, CartDTO> cart = ((HashMap<Integer, CartDTO>) session.getAttribute("shoppingcart"));
		session.setAttribute("shoppingcart", cart);
		return _mvShare;
	}

	@RequestMapping(value = "/addcart{id}")
	public String AddCart(HttpServletRequest rq, HttpSession session, @PathVariable int id) {
		@SuppressWarnings("unchecked")
		HashMap<Integer, CartDTO> cart = ((HashMap<Integer, CartDTO>) session.getAttribute("shoppingcart"));
		if (cart == null) {
			cart = new HashMap<Integer, CartDTO>();
		}
		_cartService.AddItemCart(id, cart);
		session.setAttribute("shoppingcart", cart);
		session.setAttribute("totalQuatityBill", _cartService.TotalQuatityBill(cart));
		session.setAttribute("totalPriceBill", _cartService.TotalPriceBill(cart));
		return "redirect:/cart";
		// return "redirect:"+rq.getHeader("Referer");
	}

	@RequestMapping(value = "/editcart{id}-{quanity}")
	public String EditCart(HttpServletRequest rq, HttpSession session, @PathVariable int id,
			@PathVariable int quanity) {
		@SuppressWarnings("unchecked")
		HashMap<Integer, CartDTO> cart = ((HashMap<Integer, CartDTO>) session.getAttribute("shoppingcart"));
		_cartService.EditItemCart(id, quanity, cart);
		session.setAttribute("shoppingcart", cart);
		session.setAttribute("totalQuatityBill", _cartService.TotalQuatityBill(cart));
		session.setAttribute("totalPriceBill", _cartService.TotalPriceBill(cart));
		return "redirect:/cart";
	}

	@RequestMapping(value = "/deletecart{id}")
	public String DeleteCart(HttpServletRequest rq, HttpSession session, @PathVariable int id) {
		@SuppressWarnings("unchecked")
		HashMap<Integer, CartDTO> cart = ((HashMap<Integer, CartDTO>) session.getAttribute("shoppingcart"));
		if (cart == null) {
			cart = new HashMap<Integer, CartDTO>();
		}
		_cartService.DeleteItemCart(id, cart);
		session.setAttribute("shoppingcart", cart);
		session.setAttribute("totalQuatityBill", _cartService.TotalQuatityBill(cart));
		session.setAttribute("totalPriceBill", _cartService.TotalPriceBill(cart));
		return "redirect:/cart";
		// return "redirect:"+rq.getHeader("Referer");
	}

	// mapping vao check out
	@RequestMapping(value = { "/checkout" }, method = RequestMethod.GET)
	public ModelAndView checkout (HttpSession session) { // sesion va modelAtribute form
		if (session.getAttribute("LoginSuccess") != null) {
			_mvShare.setViewName("user/cart/checkout");
			_mvShare.addObject("user", new User_setget()); // khai bao cac data khi mapping vao trang co cac data nay
			return _mvShare;
		}
		_mvShare.addObject("user", new User_setget()); // khai bao cac data khi mapping vao trang co cac data nay
		_mvShare.setViewName("user/user_info/login");
		return _mvShare;
	}

	// xu ly check out
	@RequestMapping(value = { "/checkout" }, method = RequestMethod.POST)
	public String checkout_process (HttpSession session, HttpServletRequest checkout_rq, @ModelAttribute User_setget user) { // sesion

		@SuppressWarnings("unchecked")
		HashMap<Integer, CartDTO> cart = ((HashMap<Integer, CartDTO>) session.getAttribute("shoppingcart"));
		BillsDTO bill = new BillsDTO();

		bill.setUser_id(user.getUser_id());
		bill.setUser_name(user.getUser_name());
		bill.setPhone(user.getPhone());
		bill.setAddress(user.getAddress());
		bill.setTotalPriceBill(_cartService.TotalPriceBill(cart));

		int insert_count = _cartService.AddBill(bill); // row count number them vao data

		if (insert_count > 0) {
			return "redirect:/order-list";// list cac order da dat
		}
		_mvShare.addObject("status", "ĐĂNG KÝ KHÔNG THÀNH CÔNG");
		return "redirect:/register";
	}

	// mapping vao trang Danh sach order
	@RequestMapping(value = "/order-list")
	public ModelAndView Order_List(HttpSession session) {
		_mvShare.setViewName("user/cart/order_list");
		User_setget user = (User_setget) session.getAttribute("LoginSuccess");
		if(user != null) {
			int id_user_client = user.getUser_id(); 
			_mvShare.addObject("order_list", _cartService.GetDataListOrder(id_user_client));
		}
		else {
		_mvShare.addObject("user", new User_setget()); // khai bao cac data khi mapping vao trang co cac data nay
		_mvShare.setViewName("user/user_info/login");
		}
		return _mvShare;
	}

}
