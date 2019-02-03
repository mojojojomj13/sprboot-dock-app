package com.prit.docker.dockerspringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController 
public class MyController {
	@GetMapping("/hello/{name}")
	public ResponseEntity<?> sayHello(@PathVariable ("name") String name){
		return ResponseEntity.ok("Hi "+name);
	}
}
