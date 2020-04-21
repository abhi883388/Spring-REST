package com.rest.covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CovidApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CovidApplication.class, args);
	}
	
	//Initialize bean for accessing Rest Template
	@Bean
	public RestTemplate restTemplate () {
		return new RestTemplate();
	}

}
