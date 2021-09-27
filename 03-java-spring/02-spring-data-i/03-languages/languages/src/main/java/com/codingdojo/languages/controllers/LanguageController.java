package com.codingdojo.languages.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;



@Controller
public class LanguageController {
	
	private LanguageService languageService;
	
	public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }
	
	@GetMapping("/languages")
	public String index(Model model) {
		List<Language> allLanguage = languageService.getAllLanguages();
		model.addAttribute("allLanguage", allLanguage);
		return "index.jsp";
		
	}

}
