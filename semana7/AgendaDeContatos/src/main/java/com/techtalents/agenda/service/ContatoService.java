package com.techtalents.agenda.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtalents.agenda.dto.input.ContatoDtoInput;
import com.techtalents.agenda.dto.output.ContatoDtoOutput;
import com.techtalents.agenda.entity.Contato;
import com.techtalents.agenda.entity.Endereco;
import com.techtalents.agenda.entity.Telefone;
import com.techtalents.agenda.exception.InvalidEndereco;
import com.techtalents.agenda.exception.InvalidTelefone;
import com.techtalents.agenda.exception.NotFound;
import com.techtalents.agenda.repository.ContatoRepository;
import com.techtalents.agenda.repository.EnderecoRepository;
import com.techtalents.agenda.repository.TelefoneRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;

	@Autowired
	private TelefoneRepository telefoneRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	private Contato findById(Long id) {
		Optional<Contato> contatoOptional = this.contatoRepository.findById(id);
		Contato contato = contatoOptional.orElseThrow(() -> new NotFound());
		return contato;
	}

	public ContatoDtoOutput create(ContatoDtoInput contatoDtoInput) {

		Telefone telefone = telefoneRepository.findById(contatoDtoInput.getIdTelefone()).orElseThrow(() -> new InvalidTelefone());
		Endereco endereco = enderecoRepository.findById(contatoDtoInput.getIdEndereco()).orElseThrow(() -> new InvalidEndereco());

		Contato contato = new Contato(contatoDtoInput, endereco, telefone);
		this.contatoRepository.save(contato);
		return new ContatoDtoOutput(contato);
	}

	public ContatoDtoOutput update(ContatoDtoInput contatoDtoInput, Long id) {
		Contato contato = this.findById(id);
		contato.fillContatoFromDto(contatoDtoInput);
		this.contatoRepository.save(contato);
		return new ContatoDtoOutput(contato);

	}

	public List<ContatoDtoOutput> getAll() {
		return this.contatoRepository.findAll().stream().map(ContatoDtoOutput::new).collect(Collectors.toList());
	}

	public ContatoDtoOutput get(Long id) {
		Contato contato = this.findById(id);
		return new ContatoDtoOutput(contato);
	}

	public void delete(Long id) {
		Contato contato = this.findById(id);
		this.contatoRepository.delete(contato);
	}

}
