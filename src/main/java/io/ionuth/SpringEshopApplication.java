package io.ionuth;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.ionuth.entity.UserEntity;
import io.ionuth.repository.UserRepository;

@SpringBootApplication
public class SpringEshopApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt = SpringApplication.run(SpringEshopApplication.class, args);
		UserRepository userRepository = ctxt.getBean(UserRepository.class);
		Optional<UserEntity> optUser = userRepository.findById(1l);
		System.out.println("User found: " + optUser.get().getFirstName() 
				+ " " + optUser.get().getLastName());
	}

}
