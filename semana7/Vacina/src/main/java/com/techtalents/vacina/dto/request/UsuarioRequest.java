package com.techtalents.vacina.dto.request;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioRequest {

	@Size(min = 11, max = 11)
	private String cpf;

	@PastOrPresent
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dataNascimento;

	@Email
	private String email;

	@Size(min = 2, max = 255)
	private String nome;

}
