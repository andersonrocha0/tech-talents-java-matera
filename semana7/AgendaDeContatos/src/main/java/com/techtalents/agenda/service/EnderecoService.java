package com.techtalents.agenda.service;

import java.util.List;
import java.util.Optional;

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

	public EnderecoDtoOutput update(EnderecoDtoInput enderecoDtoInput, Long id) {
		Optional<Endereco> enderecoOptional = this.enderecoRepository.findById(id);
		Endereco endereco = enderecoOptional.get();

		this.enderecoConverter.dtoToModel(enderecoDtoInput, endereco);
		this.enderecoRepository.save(endereco);
		return this.enderecoConverter.modelToDto(endereco);

	}

	public List<EnderecoDtoOutput> getAll() {
		return this.enderecoConverter.modelToDto(this.enderecoRepository.findAll());
	}

	public EnderecoDtoOutput get(Long id) {
		Optional<Endereco> enderecoOptional = this.enderecoRepository.findById(id);
		Endereco endereco = enderecoOptional.get();
		return this.enderecoConverter.modelToDto(endereco);
	}

	public void delete(Long id) {
		this.enderecoRepository.deleteById(id);
	}

}