package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		
		int a = 50;
		int b = 70;
		int c = 101;
		return "the sum of a,b & c is equals to " + (a + b + c);
		
	}
}
