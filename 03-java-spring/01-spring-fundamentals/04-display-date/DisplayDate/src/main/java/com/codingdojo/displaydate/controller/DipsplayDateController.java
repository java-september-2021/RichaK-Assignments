package com.codingdojo.displaydate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DipsplayDateController {
	
	@RequestMapping("/")
	public String displayDate() {
		
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String displayCurrentDate() {

		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String displayCurrentTime() {
		
		return "time.jsp";
	}
	

}
