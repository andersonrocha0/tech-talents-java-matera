package com.techtalents.agenda.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtalents.agenda.dto.input.EnderecoDtoInput;
import com.techtalents.agenda.dto.output.EnderecoDtoOutput;
import com.techtalents.agenda.entity.Endereco;
import com.techtalents.agenda.exception.NotFound;
import com.techtalents.agenda.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	private Endereco findById(Long id) {
		Endereco endereco = this.enderecoRepository.findById(id).orElseThrow(() -> new NotFound());
		return endereco;
	}

	public EnderecoDtoOutput create(EnderecoDtoInput enderecoDtoInput) {
		Endereco endereco = new Endereco(enderecoDtoInput);
		this.enderecoRepository.save(endereco);
		return new EnderecoDtoOutput(endereco);
	}

	public EnderecoDtoOutput update(EnderecoDtoInput enderecoDtoInput, Long id) {
		Endereco endereco = this.findById(id);
		endereco.fillEnderecoFromDto(enderecoDtoInput);
		this.enderecoRepository.save(endereco);
		return new EnderecoDtoOutput(endereco);
	}

	public List<EnderecoDtoOutput> getAll() {
		return this.enderecoRepository.findAll().stream().map(EnderecoDtoOutput::new).collect(Collectors.toList());
	}

	public EnderecoDtoOutput get(Long id) {
		Endereco endereco = this.findById(id);
		return new EnderecoDtoOutput(endereco);
	}

	public void delete(Long id) {
		Endereco endereco = this.findById(id);
		this.enderecoRepository.delete(endereco);
	}

}