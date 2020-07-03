package com.sonu.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/display")
	public String display( Principal user ) {
		return "Display User " + user.getName() ;
	}
	
	@RequestMapping("/test/check")
	public String test( Principal user ) {
		return "Test method " + user.getName() ;
	}

}
