package com.techtalents.vacina.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techtalents.vacina.BaseControllerIntegrationTest;
import com.techtalents.vacina.dto.request.AplicacaoVacinacaoRequest;
import com.techtalents.vacina.entity.Usuario;
import com.techtalents.vacina.repository.UsuarioRepository;

public class AplicacaoVacinaControllerIntegrationTest extends BaseControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private UsuarioRepository usuarioRepository;

	private AplicacaoVacinacaoRequest mockAplicacaoVacinaRequestCriacaoDaAplicacao(Long idUsuario)
			throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String data = "2021-03-08";

		AplicacaoVacinacaoRequest req = new AplicacaoVacinacaoRequest();
		req.setDataDaVacina(formatter.parse(data));
		req.setIdUsuario(idUsuario);
		req.setNomeVacina("BCG");

		return req;
	}

	private String mockJsonDeCriacaoDoAplicacaoDaVacina(AplicacaoVacinacaoRequest req)
			throws JsonProcessingException, ParseException {

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(req);
		return json;
	}

	@Test
	public void deveRetornarSucesso_quandoCriarUmaAplicacaoDeVacina() throws Exception {

		Usuario usu = new Usuario();
		usu.setCpf("12312312312");
		usu.setDataNascimento(new Date());
		usu.setEmail("teste@teste.com.br");
		usu.setNome("Teste");

		this.usuarioRepository.save(usu);

		Long idUsuario = usu.getId();

		AplicacaoVacinacaoRequest req = this.mockAplicacaoVacinaRequestCriacaoDaAplicacao(idUsuario);
		String json = this.mockJsonDeCriacaoDoAplicacaoDaVacina(req);

		this.mockMvc.perform(post("/aplicacaoVacina").contentType(MediaType.APPLICATION_JSON).content(json))
				.andExpect(MockMvcResultMatchers.status().isCreated())
				.andExpect(jsonPath("$.nomeVacina", is(req.getNomeVacina())))
				.andExpect(jsonPath("$.usuario.id", is(idUsuario.intValue())));
	}

}
