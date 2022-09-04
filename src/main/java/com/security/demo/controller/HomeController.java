package com.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Homepage</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Admin page";
	}
	
	@GetMapping("/user")
	public String user() {
		return "User page";
	}
	

}
