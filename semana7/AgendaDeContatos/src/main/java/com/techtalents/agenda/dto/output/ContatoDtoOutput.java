package com.techtalents.agenda.dto.output;

import lombok.Data;

@Data
public class ContatoDtoOutput {

	private Long id;

	private String nome;

	private EnderecoDtoOutput endereco;

	private TelefoneDtoOutput telefone;

}
