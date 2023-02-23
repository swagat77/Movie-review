package com.swagat.films;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FilmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmsApplication.class, args);
	}

}
