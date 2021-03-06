package com.techtalents.agenda.dto.output;

import com.techtalents.agenda.entity.Endereco;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class EnderecoDtoOutput {

	public EnderecoDtoOutput(Endereco endereco) {
		this.setRua(endereco.getRua());
		this.setNumero(endereco.getNumero());
		this.setComplemento(endereco.getComplemento());
		this.setCidade(endereco.getCidade());
		this.setEstado(endereco.getEstado());
		this.setCep(endereco.getCep());
		this.setId(endereco.getId());
	}

	private Long id;

	private String rua;

	private String numero;

	private String complemento;

	private String cidade;

	private String estado;

	private String cep;

}
