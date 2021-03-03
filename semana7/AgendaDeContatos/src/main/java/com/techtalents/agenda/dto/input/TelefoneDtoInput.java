package com.techtalents.agenda.dto.input;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class TelefoneDtoInput {

	private String tipo;

	// @Max(3)
	private String ddd;

	@NotNull(message = "Numero do telefone nao pode ser nulo")
	private String numero;

}
