package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class HelloController {
	@RequestMapping("/homepage")
	public String homePage() {
		return "home";
	}
	@RequestMapping("/user")
	public String userform()
	{
		return "userform";
	}
}
