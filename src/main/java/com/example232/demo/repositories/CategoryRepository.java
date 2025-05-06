package com.example232.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example232.demo.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

	

}
