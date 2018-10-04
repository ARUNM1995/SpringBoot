package com.jspider.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.poc.dto.Register;

public interface IRegisterRepository extends JpaRepository<Register, Integer>  {

	Register findByuserName(String userName);
}
