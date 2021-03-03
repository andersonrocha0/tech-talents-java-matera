package com.techtalents.agenda.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.techtalents.agenda.dto.input.TelefoneDtoInput;
import com.techtalents.agenda.dto.output.TelefoneDtoOutput;
import com.techtalents.agenda.entity.Telefone;

@Service
public class TelefoneConverter {

	public Telefone dtoToModel(TelefoneDtoInput telefoneDtoInput) {
		Telefone telefone = new Telefone();
		telefone.setDdd(telefoneDtoInput.getDdd());
		telefone.setNumero(telefoneDtoInput.getNumero());
		telefone.setTipo(telefoneDtoInput.getTipo());
		return telefone;
	}

	public TelefoneDtoOutput modelToDto(Telefone telefone) {
		TelefoneDtoOutput telefoneDtoOutput = new TelefoneDtoOutput();
		telefoneDtoOutput.setDdd(telefone.getDdd());
		telefoneDtoOutput.setId(telefone.getId());
		telefoneDtoOutput.setNumero(telefone.getNumero());
		telefoneDtoOutput.setTipo(telefone.getTipo());
		return telefoneDtoOutput;
	}

	public List<TelefoneDtoOutput> modelToDto(List<Telefone> telefones) {
		List<TelefoneDtoOutput> telefonesDtos = new ArrayList<TelefoneDtoOutput>();
		for (Telefone telefone : telefones) {
			telefonesDtos.add(this.modelToDto(telefone));
		}
		return telefonesDtos;
	}

}
