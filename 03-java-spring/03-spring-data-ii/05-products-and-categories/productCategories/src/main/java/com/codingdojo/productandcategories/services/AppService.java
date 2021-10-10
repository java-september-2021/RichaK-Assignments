package com.codingdojo.productandcategories.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.productandcategories.models.Category;
import com.codingdojo.productandcategories.models.Product;
import com.codingdojo.productandcategories.repositories.CategoryRepository;
import com.codingdojo.productandcategories.repositories.ProductRepository;

@Service
public class AppService {
	
	@Autowired
	private ProductRepository pRepo;
	
	@Autowired
	private CategoryRepository cRepo;
	
	
	//Create a Dojo
	
		public Product createProduct(Product product) {
			return this.pRepo.save(product);
		}
		
		public Category createCategory(Category category) {
			return this.cRepo.save(category);
		}
		
		public Category findByAllProducts(Product product) {
			return (Category) this.cRepo.findAllByProducts(product);
		}

		public Category  findByProductNotPresent(Product product) {
			return (Category) this.cRepo.findByProductsNotContains(product);
		}
		
}
