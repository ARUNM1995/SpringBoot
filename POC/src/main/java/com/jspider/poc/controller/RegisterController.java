package com.jspider.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.jspider.poc.dto.Register;
import com.jspider.poc.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	public RegisterController() {
		// TODO Auto-generated constructor stub
	}

	@PostMapping(value = "/register")
	public String register(Register dto) {
		registerService.register(dto);
		return "home";
	}

}
