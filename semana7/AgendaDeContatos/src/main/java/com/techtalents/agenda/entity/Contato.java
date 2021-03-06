package com.techtalents.agenda.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.techtalents.agenda.dto.input.ContatoDtoInput;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class Contato {

	public Contato(ContatoDtoInput contatoDtoInput, Endereco endereco, Telefone telefone) {
		this.fillContatoFromDto(contatoDtoInput);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
	}
	
	public void fillContatoFromDto(ContatoDtoInput contatoDtoInput) {
		this.setNome(contatoDtoInput.getNome());
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "telefone_id", referencedColumnName = "id")
	private Telefone telefone;

}
