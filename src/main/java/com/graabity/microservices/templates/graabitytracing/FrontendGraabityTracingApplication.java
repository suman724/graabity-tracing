package com.graabity.microservices.templates.graabitytracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class FrontendGraabityTracingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontendGraabityTracingApplication.class, "--spring.application.name=frontend",
				"--server.port=8081");
	}
}
