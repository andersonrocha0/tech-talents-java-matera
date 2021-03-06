package com.techtalents.agenda.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtalents.agenda.dto.input.TelefoneDtoInput;
import com.techtalents.agenda.dto.output.TelefoneDtoOutput;
import com.techtalents.agenda.entity.Telefone;
import com.techtalents.agenda.exception.NotFound;
import com.techtalents.agenda.repository.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired
	private TelefoneRepository telefoneRepository;

	private Telefone findById(Long id) {
		return this.telefoneRepository.findById(id).orElseThrow(() -> new NotFound());
	}

	public TelefoneDtoOutput create(TelefoneDtoInput telefoneDtoInput) {
		Telefone telefone = new Telefone(telefoneDtoInput);
		this.telefoneRepository.save(telefone);
		return new TelefoneDtoOutput(telefone);
	}

	public TelefoneDtoOutput update(TelefoneDtoInput telefoneDtoInput, Long id) {
		Telefone telefone = this.findById(id);

		telefone.fillTelefoneFromDto(telefoneDtoInput);

		this.telefoneRepository.save(telefone);
		return new TelefoneDtoOutput(telefone);

	}

	public List<TelefoneDtoOutput> getAll() {
		return this.telefoneRepository.findAll().stream().map(TelefoneDtoOutput::new).collect(Collectors.toList());
	}

	public TelefoneDtoOutput get(Long id) {
		Telefone telefone = this.findById(id);
		return new TelefoneDtoOutput(telefone);
	}

	public void delete(Long id) {
		Telefone telefone = this.findById(id);
		this.telefoneRepository.delete(telefone);
	}

}
