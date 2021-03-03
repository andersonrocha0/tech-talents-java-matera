package com.techtalents.agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtalents.agenda.converter.TelefoneConverter;
import com.techtalents.agenda.dto.input.TelefoneDtoInput;
import com.techtalents.agenda.dto.output.TelefoneDtoOutput;
import com.techtalents.agenda.entity.Telefone;
import com.techtalents.agenda.repository.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired
	private TelefoneRepository telefoneRepository;

	@Autowired
	private TelefoneConverter telefoneConverter;

	public TelefoneDtoOutput create(TelefoneDtoInput telefoneDto) {

		Telefone telefone = telefoneConverter.dtoToModel(telefoneDto);
		this.telefoneRepository.save(telefone);
		return this.telefoneConverter.modelToDto(telefone);
	}

	public List<TelefoneDtoOutput> getAll() {
		return this.telefoneConverter.modelToDto(this.telefoneRepository.findAll());
	}

}
