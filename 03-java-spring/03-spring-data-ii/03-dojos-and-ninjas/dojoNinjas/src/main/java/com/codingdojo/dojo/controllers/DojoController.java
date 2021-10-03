package com.codingdojo.dojo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojo.models.Dojo;
import com.codingdojo.dojo.services.DojoService;

@Controller
public class DojoController {
	
	@Autowired
	DojoService dService;
	
	@PostMapping("/dojos/new")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "Dojo/newDojo.jsp";
		}else {
			this.dService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}

}
