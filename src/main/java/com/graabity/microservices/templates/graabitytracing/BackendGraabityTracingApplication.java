package com.graabity.microservices.templates.graabitytracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class BackendGraabityTracingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendGraabityTracingApplication.class, "--spring.application.name=backend",
				"--server.port=8082");
	}
}
