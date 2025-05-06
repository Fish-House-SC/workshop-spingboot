package com.example232.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example232.demo.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	

}
