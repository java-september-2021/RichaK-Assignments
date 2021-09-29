package com.codingdojo.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.lookify.model.Lookify;

public interface LookifyRepository extends CrudRepository<Lookify, Long> {

	List<Lookify> findAll();
	
	List<Lookify> findByartistIgnoreCase(String artist);
	
	List<Lookify> findTop10ByOrderByratingsDesc(Integer ratings);
	
}