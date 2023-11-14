package io.ionuth.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloResource {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello from Sprint REST";
	}
	
}
