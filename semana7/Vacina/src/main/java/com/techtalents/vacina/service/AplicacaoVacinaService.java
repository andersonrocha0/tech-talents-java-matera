package com.techtalents.vacina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtalents.vacina.entity.AplicacaoVacina;
import com.techtalents.vacina.repository.AplicacaoVacinaRepository;

@Service
public class AplicacaoVacinaService {

	@Autowired
	private AplicacaoVacinaRepository aplicacaoVacinaRepository;

	public AplicacaoVacina create(AplicacaoVacina aplicacaoVacina) {
		return this.aplicacaoVacinaRepository.save(aplicacaoVacina);

	}

}
