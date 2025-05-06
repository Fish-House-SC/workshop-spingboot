package com.example232.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example232.demo.entities.Product;
import com.example232.demo.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product>FindAll(){
		return repository.findAll();
	}

	public Product FindById(Long id) {
	 	Optional<Product> obj = repository.findById(id);
	 	return obj.get();
	}
}
