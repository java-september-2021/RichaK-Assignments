package com.codingdojo.lookify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.lookify.services.LookifyService;

@Controller
public class LookifyController {
	
	private LookifyService lService;
	
	public LookifyController(LookifyService service) {
		this.lService = service;
	}
	

	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	
}
