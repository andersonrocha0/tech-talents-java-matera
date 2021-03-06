package com.techtalents.vacina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtalents.vacina.dto.request.AplicacaoVacinacaoRequest;
import com.techtalents.vacina.dto.response.AplicacaoVacinaResponse;
import com.techtalents.vacina.entity.AplicacaoVacina;
import com.techtalents.vacina.entity.Usuario;
import com.techtalents.vacina.exception.UsuarioInexistenteException;
import com.techtalents.vacina.repository.AplicacaoVacinaRepository;
import com.techtalents.vacina.repository.UsuarioRepository;

@Service
public class AplicacaoVacinaService {

	@Autowired
	private AplicacaoVacinaRepository aplicacaoVacinaRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	public AplicacaoVacinaResponse create(AplicacaoVacinacaoRequest aplicacaoVacinacaoRequest) {
		Usuario usuario = this.usuarioRepository.findById(aplicacaoVacinacaoRequest.getIdUsuario())
				.orElseThrow(() -> new UsuarioInexistenteException());

		AplicacaoVacina aplicacaoVacina = new AplicacaoVacina(aplicacaoVacinacaoRequest, usuario);

		AplicacaoVacina aplicacaoVacinaSalva = this.aplicacaoVacinaRepository.save(aplicacaoVacina);

		return new AplicacaoVacinaResponse(aplicacaoVacinaSalva);

	}

}
