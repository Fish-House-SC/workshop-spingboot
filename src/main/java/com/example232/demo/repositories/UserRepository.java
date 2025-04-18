package com.example232.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example232.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
