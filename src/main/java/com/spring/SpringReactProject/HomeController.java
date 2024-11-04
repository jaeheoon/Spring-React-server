package com.spring.SpringReactProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "/index";
	}
	
	@RequestMapping(value = "/login")
	@CrossOrigin
	@ResponseBody
	public String login() {
		return "Hello!!";
	}
	
}
