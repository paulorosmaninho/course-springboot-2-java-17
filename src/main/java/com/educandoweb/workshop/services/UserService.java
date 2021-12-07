package com.educandoweb.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshop.entities.User;
import com.educandoweb.workshop.repositories.UserRepository;

//Registra como um Serviço que é injetado em outra Classe
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	
	public User findById(Long id) {
		//Optional para tratar nulo
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}

}
