package com.example232.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example232.demo.entities.Category;
import com.example232.demo.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category>FindAll(){
		return repository.findAll();
	}

	public Category FindById(Long id) {
	 	Optional<Category> obj = repository.findById(id);
	 	return obj.get();
	}
}
