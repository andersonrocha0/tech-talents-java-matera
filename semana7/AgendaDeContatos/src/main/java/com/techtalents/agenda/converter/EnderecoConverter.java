package com.techtalents.agenda.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.techtalents.agenda.dto.input.EnderecoDtoInput;
import com.techtalents.agenda.dto.output.EnderecoDtoOutput;
import com.techtalents.agenda.entity.Endereco;

@Service
public class EnderecoConverter {

	public Endereco dtoToModel(EnderecoDtoInput enderecoDtoInput) {
		Endereco endereco = new Endereco();
		return this.dtoToModel(enderecoDtoInput, endereco);

	}

	public Endereco dtoToModel(EnderecoDtoInput enderecoDtoInput, Endereco endereco) {
		endereco.setRua(enderecoDtoInput.getRua());
		endereco.setNumero(enderecoDtoInput.getNumero());
		endereco.setComplemento(enderecoDtoInput.getComplemento());
		endereco.setCidade(enderecoDtoInput.getCidade());
		endereco.setEstado(enderecoDtoInput.getEstado());
		endereco.setCep(enderecoDtoInput.getCep());
		return endereco;
	}

	public EnderecoDtoOutput modelToDto(Endereco endereco) {
		EnderecoDtoOutput enderecoDtoOutput = new EnderecoDtoOutput();
		enderecoDtoOutput.setRua(endereco.getRua());
		enderecoDtoOutput.setNumero(endereco.getNumero());
		enderecoDtoOutput.setComplemento(endereco.getComplemento());
		enderecoDtoOutput.setCidade(endereco.getCidade());
		enderecoDtoOutput.setEstado(endereco.getEstado());
		enderecoDtoOutput.setCep(endereco.getCep());
		enderecoDtoOutput.setId(endereco.getId());
		return enderecoDtoOutput;
	}

	public List<EnderecoDtoOutput> modelToDto(List<Endereco> enderecos) {
		List<EnderecoDtoOutput> enderecosDtos = new ArrayList<EnderecoDtoOutput>();
		for (Endereco endereco : enderecos) {
			enderecosDtos.add(this.modelToDto(endereco));
		}
		return enderecosDtos;
	}
}