package com.techtalents.vacina.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.techtalents.vacina.dto.request.UsuarioRequest;
import com.techtalents.vacina.dto.response.UsuarioResponse;
import com.techtalents.vacina.service.UsuarioService;

@WebMvcTest(UsuarioController.class)
public class UsuarioControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UsuarioService usuarioService;

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

		UsuarioResponse usuarioResponse = new UsuarioResponse();
		usuarioResponse.setCpf(usuarioRequest.getCpf());
		usuarioResponse.setDataNascimento(usuarioRequest.getDataNascimento());
		usuarioResponse.setEmail(usuarioRequest.getEmail());
		usuarioResponse.setNome(usuarioRequest.getNome());
		usuarioResponse.setId(1001L);

		when(this.usuarioService.create(isA(UsuarioRequest.class))).thenReturn(usuarioResponse);

		this.mockMvc.perform(post("/usuario").contentType(MediaType.APPLICATION_JSON).content(json))
				.andExpect(MockMvcResultMatchers.status().isCreated())
				.andExpect(jsonPath("$.cpf", is(usuarioRequest.getCpf())));
	}
}
