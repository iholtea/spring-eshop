package io.ionuth.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.ionuth.api.HelloApi;
import io.ionuth.api.model.HelloMessage;

@RestController
public class HelloResource implements HelloApi {
	
	@Override
	public ResponseEntity<HelloMessage> sayHello() {
		HelloMessage msg = new HelloMessage();
		msg.setHeaderStr("header part");
		msg.setContentStr("body of the message");
		return ResponseEntity.status(HttpStatus.OK).body(msg);
	}
	
}
