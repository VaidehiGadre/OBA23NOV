package org.cap.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class SessionController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "account/index";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username,@RequestParam("password") String password,HttpSession session,ModelMap modelMap) {
		if(username.equalsIgnoreCase("acc1") && password.equalsIgnoreCase("123")) {
			session.setAttribute("username", username);
			return "account/success";
		} else {
			modelMap.put("error", "Invalid Account");
			return "account/index";
		}
	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		return "redirect:../account";
	}

}
