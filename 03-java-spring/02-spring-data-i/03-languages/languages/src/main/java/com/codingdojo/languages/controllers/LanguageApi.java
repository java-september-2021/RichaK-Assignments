package com.codingdojo.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;

@RestController
@RequestMapping("/langapi")
public class LanguageApi {
	
	@Autowired
	private LanguageService languageService;
	
	
	@GetMapping("")
	public List<Language> getAll(){
		 return languageService.getAllLanguages();
	}
	
	
	@PostMapping("/create")
	public Language create(Language lang) {
		return languageService.createLanguage(lang);
	}
	
	
	@GetMapping("/{id}")
	public Language getSlectedLang(@PathVariable ("id") Long id) {
		return this.languageService.getOneLanguage(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		this.languageService.deleteAlbum(id);
		return "Language has been deleted";
		
	}
	
	
	
	

}
