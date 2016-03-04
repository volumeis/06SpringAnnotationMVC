package spring.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.domain.User;

@Controller
public class UserController {
	
	//field
	
	//constructor
	
	public UserController() {
		System.out.println("==>UserController default Constructor call...");
	}
	@RequestMapping("/logonViewModelAndView.do")
	public ModelAndView logonViewModelAndView(){
		System.out.println("logonViewModelAndView start");
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("/uesr/logonView.jsp");
		
		return modelAndView;
	}
	@RequestMapping("/logon04.do")
	public ModelAndView logon01( @ModelAttribute("user") User user, 
			HttpServletRequest request, HttpSession session){
		
		System.out.println("==>logon04() start...");
		
		request.setAttribute("userId", user.getUserId());
		request.setAttribute("password", user.getPassword());
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Controller 구현 연습");
		modelAndView.setViewName("/user/logonResult.jsp");
		return modelAndView;
	}
}
