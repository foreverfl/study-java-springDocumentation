package com.example.springDocumentation.mockMvcTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHome() throws Exception {
        mockMvc.perform(get("/")) // GET 요청 수행
                .andExpect(status().isOk()) // 상태 코드 200 OK 확인
                .andExpect(view().name("home")) // 반환된 뷰의 이름 확인
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Welcome to the Home Page!"))); // 뷰 내용
                                                                                                                 // 확인
    }
}
