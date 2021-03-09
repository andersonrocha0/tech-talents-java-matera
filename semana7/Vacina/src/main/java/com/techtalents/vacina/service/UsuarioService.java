package com.techtalents.vacina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.techtalents.vacina.dto.request.UsuarioRequest;
import com.techtalents.vacina.dto.response.UsuarioResponse;
import com.techtalents.vacina.entity.Usuario;
import com.techtalents.vacina.exception.CPFInvalidoException;
import com.techtalents.vacina.exception.CPFJaExistenteException;
import com.techtalents.vacina.exception.EmailJaExistenteException;
import com.techtalents.vacina.repository.UsuarioRepository;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioResponse create(UsuarioRequest usuarioRequest) {
		this.validarCpf(usuarioRequest.getCpf());
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

	public void validarCpf(String cpf) {
		CPFValidator cpfValidator = new CPFValidator();
		try {
			cpfValidator.assertValid(cpf);
		} catch (InvalidStateException e) {
			throw new CPFInvalidoException();
		}
	}

}
