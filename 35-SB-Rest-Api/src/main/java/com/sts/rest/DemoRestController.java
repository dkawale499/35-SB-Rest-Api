package com.sts.rest;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg ="Welcome to REST API";
		return msg;
	}
	public String getGreetMsg() {
		String msg="Good Morning";
		return msg;
	}
}
