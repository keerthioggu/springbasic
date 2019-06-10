package com.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test5 {
	
	@RequestMapping(value="/goToLoginPage")
	public String gotoLogin(){
		return "Login";
	}
	@RequestMapping(value="/loginFail")
	public String loginFailRequest(Model m){
		m.addAttribute("msg","Entered invalid credentials!! Please try with valid credentials");
		return "Login";
		
	}
	@RequestMapping(value="/defaultTargetPage")
	public String defaultPage(){
		return "Success";
		
	}
	@RequestMapping(value="/logoutUser")
	public String logout(Model model) {
		model.addAttribute("message", "Logout successful!! Please login again for use site!!");
		return "Login";
	}

	@RequestMapping(value="/accessDeniedPage")
	public String accessDenied(Model model) {
		model.addAttribute("message", "Access Denied!!you don't hava access to perform that operation!!");
		return "Success";
	}


	

}
