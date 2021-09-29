package com.codingdojo.lookify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codingdojo.lookify.model.Lookify;
import com.codingdojo.lookify.repositories.LookifyRepository;

public class LookifyService {
	@Autowired
	LookifyRepository lrepo;
	
	//Get all songs
	public List<Lookify> getAllSongs(){
		return this.lrepo.findAll();
	}
	
	
	//Delete one song
	public String deleteSong(Long id) {
		this.lrepo.deleteById(id);
		return "Song got deleted";
	}

	//Add one song
	public Lookify addSong(Lookify song) {
		return this.lrepo.save(song);
	}
	
	//Search By artist name
	
	public List<Lookify> searchByArtistName(String name) {
		return this.lrepo.findByartistIgnoreCase(name);
	}
	
	
	//Search by top 10
	
	public List<Lookify> searchTopTen(Integer ratings){
		return this.lrepo.findTop10ByOrderByratingsDesc(ratings);
	}
}
