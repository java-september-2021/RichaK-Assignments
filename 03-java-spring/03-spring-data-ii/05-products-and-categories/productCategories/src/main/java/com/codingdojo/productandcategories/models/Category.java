package com.codingdojo.productandcategories.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "categoriess")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=5, max=10, message="Invalid length for Category name") // size is for String
	private String categoryName;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="YYY-MM-DD HH:mm:ss")
	private Date createdAT;

	@DateTimeFormat(pattern="YYY-MM-DD HH:mm:ss")
	private Date updatedAT;
	
	@PrePersist // We need to make sure the date is updated when the object is instantiated. Important
	protected void onCreate() {
		this.createdAT = new Date();
	}
	
	@PreUpdate //important
	protected void onUpdate() {
		this.updatedAT = new Date();
	}
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	        name = "categories_products", 
	        joinColumns = @JoinColumn(name = "category_id"), 
	        inverseJoinColumns = @JoinColumn(name = "product_id")
	    )
	    private List<Product> products;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Date getCreatedAT() {
		return createdAT;
	}

	public void setCreatedAT(Date createdAT) {
		this.createdAT = createdAT;
	}

	public Date getUpdatedAT() {
		return updatedAT;
	}

	public void setUpdatedAT(Date updatedAT) {
		this.updatedAT = updatedAT;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
