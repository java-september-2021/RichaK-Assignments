package com.codingdojo.dojo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojo.models.Dojo;
import com.codingdojo.dojo.services.DojoNinjaService;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	
	@Autowired
	private DojoNinjaService dnService;
	
	
	@GetMapping("/new")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "Dojo/newDojo.jsp";
	}
	
	
	
	@PostMapping("/addDojo")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "Dojo/newDojo.jsp";
		}else {
			this.dnService.createDojo(dojo);
			return "redirect:/ninja/new";
		}
	}
	
	@GetMapping("/{id}")
	public String showDojo(Model model, @PathVariable("id") Long id) {
		model.addAttribute("dojo", this.dnService.getOneDojo(id));
		return "detailsDojo.jsp";
	}


}
