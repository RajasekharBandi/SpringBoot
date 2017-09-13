package com.capgemini.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/hello")
	public String getHello()
	{
		return "Hello World";
	}
	

}