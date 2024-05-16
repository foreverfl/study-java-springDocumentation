package com.example.springDocumentation.mockMvcTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.springDocumentation.controller.HomeApiController;

public class DefaultRequestTest {
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        this.mockMvc = standaloneSetup(new HomeApiController())
                .defaultRequest(get("/").accept(MediaType.APPLICATION_JSON))
                .alwaysExpect(status().isOk())
                .alwaysExpect(content().contentType("application/json"))
                .build();
    }

    @Test
    public void testHome() throws Exception {
        mockMvc.perform(get("/api/"))
                .andExpect(content().json("{\"message\": \"Welcome to the Home Page!\"}"));
    }

}
