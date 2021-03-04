package com.techtalents.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtalents.agenda.converter.ContatoCoverter;
import com.techtalents.agenda.dto.input.ContatoDtoInput;
import com.techtalents.agenda.dto.output.ContatoDtoOutput;
import com.techtalents.agenda.entity.Contato;
import com.techtalents.agenda.repository.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoCoverter contatoCoverter;
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	public ContatoDtoOutput create(ContatoDtoInput contatoDtoInput) {
		Contato contato = this.contatoCoverter.dtoToModel(contatoDtoInput);
		this.contatoRepository.save(contato);
		return this.contatoCoverter.modelToDto(contato);
	}

}
