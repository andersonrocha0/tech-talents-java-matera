package com.techtalents.agenda.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.techtalents.agenda.BaseControllerIntegrationTest;
import com.techtalents.agenda.dto.input.TelefoneDtoInput;
import com.techtalents.agenda.dto.output.TelefoneDtoOutput;

public class TelefoneControllerIntegrationTest extends BaseControllerIntegrationTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void postMethod() throws Exception {

		TelefoneDtoInput input = new TelefoneDtoInput();
		input.setDdd("19");
		input.setNumero("988775544");
		input.setTipo("Celular");

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(input);

		TelefoneDtoOutput output = new TelefoneDtoOutput();
		output.setDdd(input.getDdd());
		output.setNumero(input.getNumero());
		output.setTipo(input.getTipo());
		output.setId(2002L);

		mvc.perform(post("/telefone").contentType(MediaType.APPLICATION_JSON).content(json))
				.andExpect(MockMvcResultMatchers.status().isCreated()).andExpect(jsonPath("$.ddd", is(input.getDdd())))
				.andExpect(jsonPath("$.id", is(1)));

	}

}
