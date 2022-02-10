package com.bilgeadam.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
@RequestMapping("/web")
public class WebApplication {

	public static final String Uid = UUID.randomUUID().toString();

	@GetMapping("/page")
	public ResponseEntity<String> getpage(){
		return ResponseEntity.ok("Bu web sitesi..."+ Uid+" numarali sitedir");
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
