package com.web.ds.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.web.ds.auth.repository")
public class AuthModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthModuleApplication.class, args);
	}

}
