package com.educandoweb.workshop;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.workshop.entities.User;
import com.educandoweb.workshop.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
//		O id está preenchido com null, pois será gerado automaticamente.
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		User u3 = new User(null, "John Red", "john@gmail.com", "966666666", "123456"); 
		User u4 = new User(null, "Peter Blue", "peter@gmail.com", "955555555", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
				
	}

}
