package com.microservices.cloud.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @RequestMapping("/userFallBackController")
    public String userFallBackController() {
        return "User service is taking more time than expected. Please try again later.";
    }

    @RequestMapping("/departmentFallBackController")
    public String departmentFallBackController() {
        return "Department service is taking more time than expected. Please try again later.";
    }
}
