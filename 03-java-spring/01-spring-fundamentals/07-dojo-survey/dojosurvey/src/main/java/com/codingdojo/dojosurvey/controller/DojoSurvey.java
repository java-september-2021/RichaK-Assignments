package com.codingdojo.dojosurvey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurvey {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping(value="/survey", method=RequestMethod.POST)
	public String survey(@RequestParam("name") String name, @RequestParam("location") String location,
			@RequestParam("language") String language,@RequestParam("review") String review, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("review", review);
		
		System.out.println("Location is " + name + " " + location + " " + language);
		return "result.jsp";
	}
}
