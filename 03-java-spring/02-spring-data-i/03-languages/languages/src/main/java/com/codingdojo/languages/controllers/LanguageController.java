package com.codingdojo.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;



@Controller
public class LanguageController {
	
	private LanguageService languageService;
	
	public LanguageController(LanguageService service) {
		this.languageService = service;
	}
	
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("language") Language language) {
		model.addAttribute("allLanguages", this.languageService.getAllLanguages());
		return "index.jsp";
	}
	
	@PostMapping("/")
	public String addLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			 model.addAttribute("allLanguages", this.languageService.getAllLanguages());
			 return "index.jsp";
		}
	
		this.languageService.createLanguage(language);
		return "redirect:/";
		
	}
	
	@GetMapping("/show/{id}")
	public String showLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thisLanguage", this.languageService.getOneLanguage(id));
		return "show.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editLang(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", this.languageService.getOneLanguage(id));
		return "edit.jsp";
	}
	
	

}
