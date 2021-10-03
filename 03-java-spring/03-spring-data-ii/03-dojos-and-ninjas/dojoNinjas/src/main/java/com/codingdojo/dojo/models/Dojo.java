package com.codingdojo.dojo.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="dojos")
public class Dojo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=3, max=20, message="Invalid length for name")
	private String name;
	
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="YYY-MM-DD HH:mm:ss")
	private Date createdAT;

	@DateTimeFormat(pattern="YYY-MM-DD HH:mm:ss")
	private Date updatedAT;
	
	@OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
    private List<Ninja> ninjas;
	
	
	@PrePersist // We need to make sure the date is updated when the object is instantiated. Important
	protected void onCreate() {
		this.createdAT = new Date();
	}
	
	@PreUpdate //important
	protected void onUpdate() {
		this.updatedAT = new Date();
	}

	public Dojo() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Date getUpdateAt() {
		return updatedAT;
	}
	
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAT = updatedAt;
	}

}
