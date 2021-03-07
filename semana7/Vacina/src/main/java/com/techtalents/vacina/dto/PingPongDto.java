package com.techtalents.vacina.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PingPongDto {

	public PingPongDto(Date data) {
		this.data = data;
	}

	private Date data;

	private String status = "OK";

}
