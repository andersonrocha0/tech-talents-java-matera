package com.techtalents.vacina.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(PingController.class)
public class PingControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void deveRetornarSucesso_QuandoChamarOhEndpointPing() throws Exception {
		this.mockMvc.perform(get("/ping")).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(jsonPath("$.status", is("OK")));
	}
}
