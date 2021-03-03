package com.techtalents.agenda.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.techtalents.agenda.dto.input.TelefoneDtoInput;
import com.techtalents.agenda.dto.output.TelefoneDtoOutput;
import com.techtalents.agenda.service.TelefoneService;

@RestController
@RequestMapping("/telefone")
public class TelefoneController {

	@Autowired
	private TelefoneService telefoneService;

	@GetMapping(produces = "application/json")
	public List<TelefoneDtoOutput> get() {
		return this.telefoneService.getAll();
	}

	@GetMapping(path = "/{id}", produces = "application/json")
	public TelefoneDtoOutput get(@PathVariable Long id) {
		return this.telefoneService.get(id);
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public TelefoneDtoOutput post(@Valid @RequestBody TelefoneDtoInput telefoneDtoInput) {
		return this.telefoneService.create(telefoneDtoInput);
	}

	@PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
	public TelefoneDtoOutput put(@Valid @RequestBody TelefoneDtoInput telefoneDtoInput, @PathVariable Long id) {
		return this.telefoneService.update(telefoneDtoInput, id);
	}

	@DeleteMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		this.telefoneService.delete(id);
	}

}
