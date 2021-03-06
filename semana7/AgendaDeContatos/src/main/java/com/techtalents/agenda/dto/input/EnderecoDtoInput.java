package com.techtalents.agenda.dto.input;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EnderecoDtoInput {
	
	@Size(max=255, message="Rua nao pode ser maior que 255")
	@NotBlank
	private String rua;

	@Size(max=255, message="Numero nao pode ser maior que 255")
	private String numero;

	@Size(max=255, message="Complemento nao pode ser maior que 255")
	private String complemento;

	@Size(max=255, message="Cidade nao pode ser maior que 255")
	@NotBlank
	private String cidade;

	@Size(max=2, message="Estado nao pode ser maior que 2")
	@NotBlank
	private String estado;

	@Size(max=9, message="CEP nao pode ser maior que 255")
	@NotBlank
	private String cep;

}
