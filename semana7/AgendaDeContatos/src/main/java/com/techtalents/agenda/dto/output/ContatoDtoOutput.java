package com.techtalents.agenda.dto.output;

import com.techtalents.agenda.entity.Contato;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContatoDtoOutput {

	public ContatoDtoOutput(Contato contato) {
		this.setId(contato.getId());
		this.setNome(contato.getNome());

		TelefoneDtoOutput telefoneDtoOutput = new TelefoneDtoOutput(contato.getTelefone());
		EnderecoDtoOutput enderecoDtoOutput = new EnderecoDtoOutput(contato.getEndereco());

		this.setTelefone(telefoneDtoOutput);
		this.setEndereco(enderecoDtoOutput);
	}

	private Long id;

	private String nome;

	private EnderecoDtoOutput endereco;

	private TelefoneDtoOutput telefone;

}
