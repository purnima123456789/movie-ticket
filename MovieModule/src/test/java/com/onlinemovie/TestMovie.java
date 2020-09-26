package com.onlinemovie;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class TestMovie extends MovieModuleApplicationTests {
	@Autowired
	private WebApplicationContext webApplicationContext;
	
    private MockMvc mockMvc;
    
    @Before
    public void setup() {
    	mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    
    @Test
    public void testMovie() throws Exception {
    	mockMvc.perform(get("/movie")).andExpect(status().isOk())
    	.andExpect(content().contentType("application/json;charset=UTF-8"))
		.andExpect(jsonPath("$.name").value("WAR")).andExpect(jsonPath("$.genere").value("drama"))
		.andExpect(jsonPath("$.movieId").value("M001")).andExpect(jsonPath("$.movieLength").value(120));

}
    }
