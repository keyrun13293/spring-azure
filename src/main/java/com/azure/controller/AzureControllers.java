package com.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureControllers {

    @GetMapping("/user")
    public String getUserDetails(@RequestParam(value = "id", required = false) String userId) {
        // For demonstration purposes, returning a static response
        return "User details for user id: " + userId;
    }
}

