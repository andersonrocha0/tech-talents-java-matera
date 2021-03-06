package com.techtalents.agenda.dto.input;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class TelefoneDtoInput {

	private String tipo;

	@Size(min=2, max=2, message="DDD deve conter 2 digitos")
	private String ddd;

	@Size(min=8, max=9, message="Telefone deve conter no minimo 8 e no maximo 9")
	private String numero;

}
