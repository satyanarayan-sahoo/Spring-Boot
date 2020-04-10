package com.springBoot.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/actuatorExample")
public class WelcomeController {
	
	/* GET
	 * http://localhost:8080/profileExample/welcome
	 * */
	@GetMapping(value = "/welcome")
	public String getMessage(){
		return "Welcome to Spring Boot Actuator Example: ";
	}
	
}//class
