package com.codingdojo.dojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojo.models.Dojo;
import com.codingdojo.dojo.models.Ninja;
import com.codingdojo.dojo.repositories.DojoRepository;
import com.codingdojo.dojo.repositories.NinjaRepository;


@Service
public class DojoNinjaService {

	@Autowired
	private DojoRepository dRepo;
	
	@Autowired
	private NinjaRepository nRepo;
	
	
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
	
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
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
