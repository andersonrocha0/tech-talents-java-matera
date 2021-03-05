package com.techtalents.agenda.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techtalents.agenda.dto.input.ContatoDtoInput;
import com.techtalents.agenda.dto.output.ContatoDtoOutput;
import com.techtalents.agenda.service.ContatoService;

@RestController
@RequestMapping("/contato")
public class ContatoController {

	@Autowired
	private ContatoService contatoService;

	@GetMapping(produces = "application/json")
	public List<ContatoDtoOutput> get() {
		return this.contatoService.getAll();
	}

	@GetMapping(path = "/{id}", produces = "application/json")
	public ContatoDtoOutput get(@PathVariable Long id) {
		return this.contatoService.get(id);
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public ContatoDtoOutput post(@RequestBody ContatoDtoInput contatoDtoInput) {
		return this.contatoService.create(contatoDtoInput);
	}

	@PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
	public ContatoDtoOutput put(@Valid @RequestBody ContatoDtoInput contatoDtoInput, @PathVariable Long id) {
		return this.contatoService.update(contatoDtoInput, id);
	}

	@DeleteMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		this.contatoService.delete(id);
	}

}
