package com.example.springDocumentation.unitTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.env.MockEnvironment;
import org.springframework.mock.env.MockPropertySource;

@SpringBootTest
public class EnvironmentTest {

    private MockEnvironment mockEnvironment;

    @BeforeEach
    public void setup() {
        mockEnvironment = new MockEnvironment();
        MockPropertySource mockPropertySource = new MockPropertySource()
                .withProperty("spring.application.name", "springDocumentation")
                .withProperty("spring.datasource.url", "jdbc:postgresql://127.0.0.1:5432/spring_documentation")
                .withProperty("spring.datasource.username", "postgres");

        mockEnvironment.getPropertySources().addFirst(mockPropertySource);

    }

    @Test
    public void testGetApplicationName() {
        String applicationName = mockEnvironment.getProperty("spring.application.name");
        assertThat(applicationName, equalTo("springDocumentation"));
    }

    @Test
    public void testGetDatasourceUrl() {
        String datasourceUrl = mockEnvironment.getProperty("spring.datasource.url");
        assertThat(datasourceUrl, equalTo("jdbc:postgresql://127.0.0.1:5432/spring_documentation"));
    }

    @Test
    public void testGetDatasourceUsername() {
        String datasourceUsername = mockEnvironment.getProperty("spring.datasource.username");
        assertThat(datasourceUsername, equalTo("postgres"));
    }

}
