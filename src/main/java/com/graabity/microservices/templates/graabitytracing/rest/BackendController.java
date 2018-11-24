package com.graabity.microservices.templates.graabitytracing.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class BackendController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/date")
    public String date(){
        logger.info("date invoked");
        return new Date().toString();
    }
}
