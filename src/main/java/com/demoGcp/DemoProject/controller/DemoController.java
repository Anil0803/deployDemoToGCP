package com.demoGcp.DemoProject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${myMessage}")
    private String valueMessage;

    @GetMapping(value = "/sayHello")
    public String sayHello() {
        return valueMessage;
    }
}
