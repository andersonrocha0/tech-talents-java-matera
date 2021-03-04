package com.techtalents.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtalents.agenda.converter.EnderecoConverter;
import com.techtalents.agenda.dto.input.EnderecoDtoInput;
import com.techtalents.agenda.dto.output.EnderecoDtoOutput;
import com.techtalents.agenda.entity.Endereco;
import com.techtalents.agenda.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private EnderecoConverter enderecoConverter;

	public EnderecoDtoOutput create(EnderecoDtoInput enderecoDtoInput) {
		Endereco endereco = enderecoConverter.dtoToModel(enderecoDtoInput);
		this.enderecoRepository.save(endereco);
		return this.enderecoConverter.modelToDto(endereco);
	}

}