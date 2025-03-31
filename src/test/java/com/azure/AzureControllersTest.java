package com.azure;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.azure.controller.AzureControllers;

@WebMvcTest(AzureControllers.class)
public class AzureControllersTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetUserDetails() throws Exception {
        mockMvc.perform(get("/keyrun"))
                .andExpect(status().isOk())
                .andExpect(content().string("This is my new app Nutan"));
    }
}
