package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/helloController")
    public String helloController(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }
}
