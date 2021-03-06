package com.techtalents.vacina.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.techtalents.vacina.dto.request.AplicacaoVacinacaoRequest;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class AplicacaoVacina {

	public AplicacaoVacina(AplicacaoVacinacaoRequest aplicacaoVacinacaoRequest, Usuario usuario) {
		this.fillFromDto(aplicacaoVacinacaoRequest);
		this.setUsuario(usuario);
	}

	public void fillFromDto(AplicacaoVacinacaoRequest aplicacaoVacinacaoRequest) {
		this.setDataDaVacina(aplicacaoVacinacaoRequest.getDataDaVacina());
		this.setNomeDaVacina(aplicacaoVacinacaoRequest.getNomeVacina());

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 20)
	private String nomeDaVacina;

	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dataDaVacina;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

}
