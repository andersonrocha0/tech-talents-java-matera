package com.techtalents.agenda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = { "id" })
@Entity
public class Endereco {

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