package com.example.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ZarfilesApplication {
	@GetMapping("/message")
	public String message() {
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(ZarfilesApplication.class, args);
	}

}
