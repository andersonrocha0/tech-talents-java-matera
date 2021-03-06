package com.techtalents.agenda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.techtalents.agenda.dto.input.TelefoneDtoInput;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class Telefone {

	public Telefone(TelefoneDtoInput telefoneDtoInput) {
		fillTelefoneFromDto(telefoneDtoInput);
	}

	public void fillTelefoneFromDto(TelefoneDtoInput telefoneDtoInput) {
		this.setDdd(telefoneDtoInput.getDdd());
		this.setNumero(telefoneDtoInput.getNumero());
		this.setTipo(telefoneDtoInput.getTipo());
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tipo;

	@Column(nullable = false, length = 2)
	private String ddd;

	@Column(nullable = false)
	private String numero;

}
