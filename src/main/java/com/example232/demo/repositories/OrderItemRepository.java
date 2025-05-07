package com.example232.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example232.demo.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long > {

	

}
