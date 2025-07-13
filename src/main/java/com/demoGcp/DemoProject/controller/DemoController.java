package com.demoGcp.DemoProject.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@OpenAPIDefinition(servers = {
        @Server(url = "https://spring-gcp-cloud-run-demo-706121786956.europe-west1.run.app")
})
public class DemoController {

    @Value("${myMessage}")
    private String valueMessage;

    @GetMapping(value = "/sayHello")
    public String sayHello() {
        return valueMessage;
    }

    @GetMapping(value = "/sayBye")
    public String sayBye() {
        return "BYE BYE from Cloud!!!";
    }
}
