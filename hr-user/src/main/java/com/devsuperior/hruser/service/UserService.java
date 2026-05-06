package com.devsuperior.hruser.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hruser.dto.UserDTO;
import com.devsuperior.hruser.entities.User;
import com.devsuperior.hruser.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public UserDTO findById(Long id) {
		Optional<User> user = repository.findById(id);
		User entity = user.orElseThrow(() -> new RuntimeException("Entity not found"));
		return new UserDTO(entity);
	}
	
	public UserDTO findByEmail(String email) {
		User user = repository.findByEmail(email);
		return new UserDTO(user);
	}
}
