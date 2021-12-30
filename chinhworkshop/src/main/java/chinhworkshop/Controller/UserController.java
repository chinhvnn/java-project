package chinhworkshop.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import chinhworkshop.Entity.User_setget;

@Controller
public class UserController extends BaseController {

	// mapping vao trang dang nhap
	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public ModelAndView login() {
		_mvShare.setViewName("user/user_info/login");
		_mvShare.addObject("user", new User_setget()); // khai bao cac data khi mapping vao trang co cac data nay
		return _mvShare;
	}

	// xu ly dang nhap
	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String login_process(HttpSession session, HttpServletRequest request,  @ModelAttribute User_setget user) { // sesion va modelAtribute form
		
		System.out.println("truoc check "+user);
		User_setget user_db = _accountservice.CheckLogin(user);
		if ( user_db != null) {
			session.setAttribute("LoginSuccess", user_db);
			return "redirect:"+request.getHeader("Referer");
		}
		_mvShare.addObject("status", "THÔNG TIN ĐĂNG NHẬP KHÔNG ĐÚNG");
		return "redirect:"+request.getHeader("Referer");
	}

	// mapping vao trang dang ky
	@RequestMapping(value = { "/register" })
	public ModelAndView register() {
		_mvShare.setViewName("user/user_info/register");
		_mvShare.addObject("user", new User_setget()); // khai bao cac data khi mapping vao trang co cac data nay
		return _mvShare;
	}

	// xu ly dang ky
	@RequestMapping(value = { "/register" }, method = RequestMethod.POST)
	public String reg_process(HttpSession session, @ModelAttribute User_setget user) { // sesion va modelAtribute form

		int insert_count = _accountservice.AddUser(user); // row count number them vao data
		
		if (insert_count == -1) {
			_mvShare.addObject("status", "TRÙNG EMAIL HOẶC USER NAME");
			return "redirect:/register";
		}
		if (insert_count > 0) {
			session.setAttribute("LoginSuccess", user);
			return "redirect:/home";
		}
		_mvShare.addObject("status", "ĐĂNG KÝ KHÔNG THÀNH CÔNG");
		return "redirect:/register";
	}
	
	// xu ly dang xuat
	@RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
	public String logout(HttpSession session) { 
		session.removeAttribute("LoginSuccess");
		session.removeAttribute("shoppingcart");
		session.removeAttribute("totalQuanityBill");
		session.removeAttribute("totalPriceBill");
		return "redirect:/home";
	}
	
	// mapping vao trang profile
		@RequestMapping(value = { "/profile" })
		public ModelAndView profile(HttpSession session) {
			_mvShare.setViewName("user/user_info/profile");
			return _mvShare;
		}

}
