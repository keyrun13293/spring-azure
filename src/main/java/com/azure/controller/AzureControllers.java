package com.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureControllers {

    @GetMapping("/keyrun")
    public String getUserDetails() {
        // For demonstration purposes, returning a static response
        return "I have developed a Spring Boot application from the ground up, utilizing GitHub Actions for deployment to Azure.";
    }
}

