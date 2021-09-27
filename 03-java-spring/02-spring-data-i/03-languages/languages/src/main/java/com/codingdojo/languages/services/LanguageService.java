package com.codingdojo.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {

	@Autowired
	private LanguageRepository langRepository;
	
//	public LanguageService(LanguageRepository langRepository) {
//		this.langRepository = langRepository;
//	}
	
	//Return all languages
	
	public List<Language> getAllLanguages(){
		return langRepository.findAll();
		
	}
	
	//Create a language
	
	public Language createLanguage(Language lang) {
		return this.langRepository.save(lang);
	}
	
	//Retrieve specific language and details
	
	public Language getOneLanguage(Long id) {
		
		return this.langRepository.findById(id).orElse(null);
	}
	
	
	
	//Update a language
	
	public Language updateLanguage(Language lang) {
		return this.langRepository.save(lang);
	}
	
	//Delete specific language at that id
	
	public String deleteAlbum(Long id) {
		this.langRepository.deleteById(id);
		return "Language has been deleted";
	}
	
}
