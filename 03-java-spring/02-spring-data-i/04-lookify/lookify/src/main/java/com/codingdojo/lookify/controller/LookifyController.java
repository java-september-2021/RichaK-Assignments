package com.codingdojo.lookify.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.lookify.model.Lookify;
import com.codingdojo.lookify.services.LookifyService;

@Controller
public class LookifyController {
	@Autowired
	private LookifyService lService;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute("songs", this.lService.allSongs());
		return "songs.jsp";
	}

	@GetMapping("/songs/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("song", this.lService.findSong(id));
		return "show.jsp";
	}
	
	@GetMapping("/songs/search")
	public String search(@RequestParam(value="artist") String artist, Model model) {
		model.addAttribute("songs", this.lService.searchByArtistName(artist));
		model.addAttribute("artist", artist);
		return "searched.jsp";
	}
	
	@GetMapping("/songs/new")
	public String newSong(@ModelAttribute("songs") Lookify lookify) {
		return "new.jsp";
	}
	
	@PostMapping("/songs")
	public String createSong(@Valid @ModelAttribute("songs") Lookify lookify, BindingResult result, Model model) {
		if(result.hasErrors()) {
//			 model.addAttribute("songs", this.lService.allSongs());
			 return "new.jsp";
		}
		this.lService.addSong(lookify);
		return "redirect:/songs";		
	}
	
	@GetMapping("/songs/topTen")
	public String getTopTen(Model model) {
		model.addAttribute("songs", this.lService.searchTopTen());
		return "topTen.jsp";
	}
	
	
	@DeleteMapping("/songs/{id}")
	public String deleteSong(@PathVariable("id") Long id) {
		this.lService.deleteSong(id);
		return "redirect:/songs";
	}
	
	
	

	
	
}
