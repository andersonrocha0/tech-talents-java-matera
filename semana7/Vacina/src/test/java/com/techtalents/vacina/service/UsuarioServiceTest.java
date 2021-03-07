package com.techtalents.vacina.service;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

import com.techtalents.vacina.dto.request.UsuarioRequest;
import com.techtalents.vacina.dto.response.UsuarioResponse;
import com.techtalents.vacina.entity.Usuario;
import com.techtalents.vacina.repository.UsuarioRepository;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class UsuarioServiceTest {

	@MockBean
	private UsuarioRepository usuarioRepository;

	@InjectMocks
	private UsuarioService usuarioService;

	@Test
	public void deveRetornarUsuarioCriado_QuandoCriarNovoUsuario() throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String data = "1990-09-28";

		UsuarioRequest usuarioRequest = new UsuarioRequest();
		usuarioRequest.setCpf("12312312312");
		usuarioRequest.setDataNascimento(formatter.parse(data));
		usuarioRequest.setEmail("email@email.com");
		usuarioRequest.setNome("Anderson Rocha");

		Usuario usuario = new Usuario();
		usuario.setCpf(usuarioRequest.getCpf());
		usuario.setDataNascimento(usuarioRequest.getDataNascimento());
		usuario.setEmail(usuarioRequest.getEmail());
		usuario.setNome(usuarioRequest.getNome());
		usuario.setId(1L);

		when(this.usuarioRepository.save(isA(Usuario.class))).thenReturn(usuario);

		UsuarioResponse usuarioCriado = usuarioService.create(usuarioRequest);

		Assert.isTrue(usuarioCriado.getEmail().equals(usuarioRequest.getEmail()), "");
	}

}
