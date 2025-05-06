package com.example232.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example232.demo.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

	

}
