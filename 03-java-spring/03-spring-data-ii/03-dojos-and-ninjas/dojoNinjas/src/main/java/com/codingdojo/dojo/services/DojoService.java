package com.codingdojo.dojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojo.models.Dojo;
import com.codingdojo.dojo.repositories.DojoRepository;


@Service
public class DojoService {

	@Autowired
	private DojoRepository dRepo;
	
	//Gel All Dojos
	
	public List<Dojo> getAllDojos(){
		return this.dRepo.findAll();
	}
	
	
	//Get one dojo
	
	public Dojo getOneDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	//Create a Dojo
	
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	//Update a Dojo
	
	public Dojo updateDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	//Delete a Dojo
	
	public String deleteDojo(Long id) {
		this.dRepo.deleteById(id);
		return "The Dojo has been deleted";
	}
	
	
	
	
	
}
