package com.codingdojo.displaydate.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DipsplayDateController {
	
	private Date getDate() {
		Date nowDate = new Date();
		return nowDate;
	}
	
	@RequestMapping("/")
	public String displayDashboard() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String displayCurrentDate(Model model) {
		model.addAttribute("datetime", getDate());
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String displayCurrentTime(Model model) {
		model.addAttribute("datetime", getDate());
		return "time.jsp";
	}
	

}
