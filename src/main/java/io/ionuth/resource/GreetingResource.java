package io.ionuth.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingResource {
	
	@GetMapping("/")
	public String sayHello() {
		return "Greeting from Sprint REST";
	}
	
}
