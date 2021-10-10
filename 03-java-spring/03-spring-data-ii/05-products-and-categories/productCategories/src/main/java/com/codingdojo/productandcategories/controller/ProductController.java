package com.codingdojo.productandcategories.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.productandcategories.models.Product;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@GetMapping("/new")
	public String getProduct(@ModelAttribute("pr") Product products) {
		return "newProduct.jsp";
	}
	
	
	

}
