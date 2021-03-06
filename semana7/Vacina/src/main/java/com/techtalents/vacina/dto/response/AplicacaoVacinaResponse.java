package com.techtalents.vacina.dto.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.techtalents.vacina.entity.AplicacaoVacina;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AplicacaoVacinaResponse {

	public AplicacaoVacinaResponse(AplicacaoVacina aplicacaoVacina) {
		this.setDataDaVacina(aplicacaoVacina.getDataDaVacina());
		this.setId(aplicacaoVacina.getId());
		this.setNomeVacina(aplicacaoVacina.getNomeDaVacina());

		UsuarioResponse usuarioResponse = new UsuarioResponse(aplicacaoVacina.getUsuario());

		this.setUsuario(usuarioResponse);
	}

	private Long id;

	private String nomeVacina;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dataDaVacina;

	private UsuarioResponse usuario;

}
