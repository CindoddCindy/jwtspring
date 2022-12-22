package com.springjwt.jwtspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class JwtspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtspringApplication.class, args);
	}

}
