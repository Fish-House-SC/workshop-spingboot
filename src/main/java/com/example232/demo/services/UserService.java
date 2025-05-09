package com.example232.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example232.demo.entities.User;
import com.example232.demo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User>FindAll(){
		return repository.findAll();
	}

	public User FindById(Long id) {
	 	Optional<User> obj = repository.findById(id);
	 	return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
