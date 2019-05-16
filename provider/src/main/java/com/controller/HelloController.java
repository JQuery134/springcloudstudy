package com.controller;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello world";
    }
}
