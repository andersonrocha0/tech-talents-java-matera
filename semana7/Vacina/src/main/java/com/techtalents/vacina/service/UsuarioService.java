package com.techtalents.vacina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.techtalents.vacina.dto.request.UsuarioRequest;
import com.techtalents.vacina.dto.response.UsuarioResponse;
import com.techtalents.vacina.entity.Usuario;
import com.techtalents.vacina.exception.CPFJaExistenteException;
import com.techtalents.vacina.exception.EmailJaExistenteException;
import com.techtalents.vacina.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioResponse create(UsuarioRequest usuarioRequest) {
		Usuario usuario = new Usuario(usuarioRequest);
		try {
			Usuario usuarioCriado = this.usuarioRepository.save(usuario);
			return new UsuarioResponse(usuarioCriado);
		} catch (DataIntegrityViolationException e) {

			if (this.usuarioRepository.findByEmail(usuarioRequest.getEmail()).isPresent()) {
				throw new EmailJaExistenteException();
			} else if (this.usuarioRepository.findByCpf(usuarioRequest.getCpf()).isPresent()) {
				throw new CPFJaExistenteException();
			} else {
				throw e;
			}

		}

	}

}
