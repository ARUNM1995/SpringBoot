package com.jspider.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.poc.dto.Register;
import com.jspider.poc.repository.IRegisterRepository;

@Service
public class RegisterService {

	@Autowired
	private IRegisterRepository iRegisterRepository;
	
	public void register(Register dto) {
		//iRegisterRepository.findById(id);
		iRegisterRepository.save(dto);
	}
	
}
