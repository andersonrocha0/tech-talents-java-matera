package com.techtalents.agenda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.techtalents.agenda.dto.input.EnderecoDtoInput;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class Endereco {
	
	public Endereco(EnderecoDtoInput enderecoDtoInput) {
		fillEnderecoFromDto(enderecoDtoInput);
	}

	public void fillEnderecoFromDto(EnderecoDtoInput enderecoDtoInput) {
		this.setRua(enderecoDtoInput.getRua());
		this.setNumero(enderecoDtoInput.getNumero());
		this.setComplemento(enderecoDtoInput.getComplemento());
		this.setCidade(enderecoDtoInput.getCidade());
		this.setEstado(enderecoDtoInput.getEstado());
		this.setCep(enderecoDtoInput.getCep());
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String rua;

	private String numero;

	private String complemento;

	@Column(nullable = false)
	private String cidade;

	@Column(nullable = false, length = 2)
	private String estado;

	@Column(nullable = false, length = 9)
	private String cep;

}