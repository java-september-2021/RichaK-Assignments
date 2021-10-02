package com.codingdojo.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.lookify.model.Lookify;
import com.codingdojo.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	
	private LookifyRepository lrepo;
	
	public LookifyService(LookifyRepository lrepo) {
		this.lrepo = lrepo;
	}
	
	//Get all songs
	public List<Lookify> allSongs(){
		return this.lrepo.findAll();
	}
	
	//Find a song
	
	public Lookify findSong(Long id) {
		return this.lrepo.findById(id).orElse(null);
	}
	
	//List top 10 song
	
	public List<Lookify> topTenByRating(){
		return this.lrepo.findTop10ByOrderByRatingsDesc();
	}

	
	//Delete song
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
		return this.lrepo.findByArtistContaining(name);
	}
	
	
	//Search by top 10
	
	public List<Lookify> searchTopTen(){
		return this.lrepo.findTop10ByOrderByRatingsDesc();
	}
	
	public Lookify updateSong(Lookify song) {
		return this.lrepo.save(song);
	}
}
