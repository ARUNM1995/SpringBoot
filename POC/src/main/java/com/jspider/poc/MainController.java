package com.jspider.poc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	
	public MainController() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	@GetMapping("/")
	public String loadPage() {
		return "register";
	}
}
