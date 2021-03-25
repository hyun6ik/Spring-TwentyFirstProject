package com.example.springandaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringandawsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringandawsApplication.class, args);
	}

}
