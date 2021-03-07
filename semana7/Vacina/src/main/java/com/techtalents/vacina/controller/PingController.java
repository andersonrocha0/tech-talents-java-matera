package com.techtalents.vacina.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtalents.vacina.dto.PingPongDto;

@RestController
@RequestMapping("/ping")
public class PingController {

	@GetMapping
	public PingPongDto get() {
		return new PingPongDto(new Date());
	}

}
