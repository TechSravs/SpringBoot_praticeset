package com.DemoApp.MyBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	@RequestMapping("/")
	
	public String greet() {
		return "welcome";
		
	}
	@RequestMapping("/about")
	public String about() {
		return "we dont teach,we educate!!";
	}

}
