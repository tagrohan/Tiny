package com.hashed.tiny.tiny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TinyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinyApplication.class, args);
		System.out.println("its working ...");
	}

}
