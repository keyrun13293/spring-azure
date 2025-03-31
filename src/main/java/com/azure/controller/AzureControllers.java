package com.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureControllers {

    @GetMapping("/keyrun")
    public String getUserDetails() {
        // For demonstration purposes, returning a static response
        return "This is my new app Nutan";
    }
}

