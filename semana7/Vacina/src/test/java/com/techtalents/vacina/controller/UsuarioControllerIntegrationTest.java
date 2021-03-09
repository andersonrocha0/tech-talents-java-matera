package com.techtalents.vacina.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techtalents.vacina.BaseControllerIntegrationTest;
import com.techtalents.vacina.dto.request.UsuarioRequest;
import com.techtalents.vacina.exception.CPFInvalidoException;

public class UsuarioControllerIntegrationTest extends BaseControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	private UsuarioRequest mockUsuarioRequestCriacaoDoUsuario() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String data = "1990-09-28";

		UsuarioRequest usuarioRequest = new UsuarioRequest();
		usuarioRequest.setCpf("07559309089");
		usuarioRequest.setDataNascimento(formatter.parse(data));
		usuarioRequest.setNome("Anderson Rocha");
		usuarioRequest.setEmail("anderson-rocha@outlook.com");
		return usuarioRequest;
	}

	private String mockJsonDeCriacaoDoUsuario(UsuarioRequest usuarioRequest)
			throws JsonProcessingException, ParseException {

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(usuarioRequest);
		return json;
	}

	@Test
	public void deveRetornarSucesso_quandoCriarUmUsuario() throws Exception {

		UsuarioRequest usuarioRequest = this.mockUsuarioRequestCriacaoDoUsuario();
		String json = this.mockJsonDeCriacaoDoUsuario(usuarioRequest);

		this.mockMvc.perform(post("/usuario").contentType(MediaType.APPLICATION_JSON).content(json))
				.andExpect(MockMvcResultMatchers.status().isCreated())
				.andExpect(jsonPath("$.cpf", is(usuarioRequest.getCpf())));
	}

	@Test
	public void deveRetonarBadRequest_quandoTentarCriarUmUsuarioComCpfInvalido() throws Exception {

		UsuarioRequest usuarioRequest = this.mockUsuarioRequestCriacaoDoUsuario();
		usuarioRequest.setCpf("12312312312");
		String json = this.mockJsonDeCriacaoDoUsuario(usuarioRequest);

		this.mockMvc.perform(post("/usuario").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print())
				.andExpect(MockMvcResultMatchers.status().isBadRequest())
				.andExpect(result -> Assert.isTrue(result.getResolvedException() instanceof CPFInvalidoException, ""));

	}

}
