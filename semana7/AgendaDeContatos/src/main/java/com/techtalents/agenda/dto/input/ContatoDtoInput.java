package com.techtalents.agenda.dto.input;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContatoDtoInput {
	
	@Size(min=3, max=255, message="Nome deve ter entre 3 e 255 caracteres")
	private String nome;

	@NotNull
	@Positive
	private Long idEndereco;

	@NotNull
	@Positive
	private Long idTelefone;

}
