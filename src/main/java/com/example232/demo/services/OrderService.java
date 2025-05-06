package com.example232.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example232.demo.entities.Order;
import com.example232.demo.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order>FindAll(){
		return repository.findAll();
	}

	public Order FindById(Long id) {
	 	Optional<Order> obj = repository.findById(id);
	 	return obj.get();
	}
}
