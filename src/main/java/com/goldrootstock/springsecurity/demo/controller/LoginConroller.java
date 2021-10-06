package com.goldrootstock.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginConroller {
	
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		
		//  "plain-login";
		
		return "fancy-login";
	}
	
	// add request mapping for /access-denied
	
	@GetMapping("/access-denied")
	public String showAccessDenied() {
		
		return "access-denied";
	}

}
