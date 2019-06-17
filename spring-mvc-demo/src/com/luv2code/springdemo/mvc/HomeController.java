package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu"; // return the name of the view, remember that the prefix and sufix are ajusted to get WEB-INF/view/main-menu.jsp
	}
}
