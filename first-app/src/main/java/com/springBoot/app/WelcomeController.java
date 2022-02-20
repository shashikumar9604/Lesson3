package com.springBoot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
	@GetMapping("/Welcome")
	public String Welcome()
	{
		return "WelCome to Spring Boot App Development user details";
	
	
	
	
	}

}
