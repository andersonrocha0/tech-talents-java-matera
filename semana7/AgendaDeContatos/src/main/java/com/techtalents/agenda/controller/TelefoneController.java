package com.techtalents.agenda.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtalents.agenda.dto.input.TelefoneDtoInput;
import com.techtalents.agenda.dto.output.TelefoneDtoOutput;
import com.techtalents.agenda.service.TelefoneService;

@RestController
@RequestMapping("/telefone")
public class TelefoneController {

	@Autowired
	private TelefoneService telefoneService;

	@GetMapping
	public List<TelefoneDtoOutput> get() {
		return this.telefoneService.getAll();
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	public TelefoneDtoOutput post(@Valid @RequestBody TelefoneDtoInput telefoneDto) {
		return this.telefoneService.create(telefoneDto);
	}

}
