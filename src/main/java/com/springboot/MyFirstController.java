package com.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/DevSecOps")

public class MyFirstController {
	
	@GetMapping
	public String returnValue() {
		
		return "Hi, Welcome to DevSecOps Training Session with Java Based SpringBoot Application";
	}

}
