package com.springBoot.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/profileExample")
public class WelcomeController {
	
	@Value("${message}")
	private String message;
	
	/* GET
	 * http://localhost:8080/profileExample/welcome
	 * */
	@GetMapping(value = "/welcome")
	public String getMessage(){
		return "Welcome to Spring Boot Profile Example: "+message;
	}
	
}//class
