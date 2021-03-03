package com.techtalents.agenda.dto.input;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class TelefoneDtoInput {

	private String tipo;

	@Max(message = "DDD deve conter no maximo 3 caracters", value=3)
	private String ddd;

	@NotNull(message = "Numero do telefone nao pode ser nulo")
	private String numero;

}
