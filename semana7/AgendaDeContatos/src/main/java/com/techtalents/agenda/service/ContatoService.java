package com.techtalents.agenda.service;

import java.util.List;
import java.util.Optional;

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
	
	public ContatoDtoOutput update(ContatoDtoInput contatoDtoInput, Long id) {
		Contato contato = this.contatoRepository.findById(id).get();
		contato.setNome(contatoDtoInput.getNome());
		this.contatoRepository.save(contato);
		return this.contatoCoverter.modelToDto(contato);
		
	}

	public List<ContatoDtoOutput> getAll() {

		return this.contatoCoverter.modelToDto(this.contatoRepository.findAll());
	}

	public ContatoDtoOutput get(Long id) {
		Optional<Contato> contatoOptional = this.contatoRepository.findById(id);
		Contato contato = contatoOptional.get();
		return this.contatoCoverter.modelToDto(contato);
	}

	public void delete(Long id) {
		this.contatoRepository.deleteById(id);
	}

}
