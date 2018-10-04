package com.jspider.poc.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="REGISTER")
public class Register implements Serializable{

	@Id
	@GenericGenerator(name = "arun", strategy = "increment")
	@GeneratedValue(generator="arun")
	private  int id;
	private  String userName;
	private String password;
	
	public Register() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}
