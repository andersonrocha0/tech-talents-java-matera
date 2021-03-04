package com.techtalents.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtalents.agenda.dto.input.EnderecoDtoInput;
import com.techtalents.agenda.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@RequestMapping
	private String get() {
		return "Teste get Endereço";
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	public EnderecoDtoInput post(@RequestBody EnderecoDtoInput enderecoDtoInput) {
		return this.enderecoService.create(enderecoDtoInput);
	}

}