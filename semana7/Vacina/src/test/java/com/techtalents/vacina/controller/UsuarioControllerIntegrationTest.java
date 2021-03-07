package com.techtalents.vacina.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.techtalents.vacina.BaseControllerIntegrationTest;
import com.techtalents.vacina.dto.request.UsuarioRequest;


public class UsuarioControllerIntegrationTest extends BaseControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void deveRetornarSucesso_quandoCriarUmUsuario() throws Exception {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String data = "1990-09-28";

		UsuarioRequest usuarioRequest = new UsuarioRequest();
		usuarioRequest.setCpf("12312312312");
		usuarioRequest.setDataNascimento(formatter.parse(data));
		usuarioRequest.setNome("Anderson Rocha");
		usuarioRequest.setEmail("anderson-rocha@outlook.com");
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(usuarioRequest);

		this.mockMvc.perform(post("/usuario").contentType(MediaType.APPLICATION_JSON).content(json))
				.andExpect(MockMvcResultMatchers.status().isCreated())
				.andExpect(jsonPath("$.cpf", is(usuarioRequest.getCpf())));
	}
}
