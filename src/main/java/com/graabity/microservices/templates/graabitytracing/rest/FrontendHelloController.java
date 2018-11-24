package com.graabity.microservices.templates.graabitytracing.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
@RequestMapping("/rest")
public class FrontendHelloController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RestTemplate restTemplate;


    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/hello")
    public String hello() {
        logger.info("hello invoked");
        String backendStr = restTemplate.getForObject("http://localhost:8082/api/date", String.class);
        return "Hello World!! @" + backendStr;
    }
}
