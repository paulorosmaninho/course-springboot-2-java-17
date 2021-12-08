package com.educandoweb.workshop;

import java.time.Instant;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.workshop.entities.Order;
import com.educandoweb.workshop.entities.User;
import com.educandoweb.workshop.entities.enums.OrderStatus;
import com.educandoweb.workshop.repositories.OrderRepository;
import com.educandoweb.workshop.repositories.UserRepository;


@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Logger logger = LoggerFactory.getLogger(TestConfig.class); 
		
//		O id está preenchido com null, pois será gerado automaticamente.
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		User u3 = new User(null, "John Red", "john@gmail.com", "966666666", "123456"); 
		User u4 = new User(null, "Peter Blue", "peter@gmail.com", "955555555", "123456");
		
		logger.info("Logando Instant:" + Instant.now().toString());
		
		//A data/hora abaixo está no formato UTC e pode ser calculada
		//para o valor local de quem desejar.
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T13:42:22Z"), OrderStatus.DELIVERED,u1); 
		Order o4 = new Order(null, Instant.parse("2019-08-20T17:51:29Z"), OrderStatus.SHIPPED,u3); 
		Order o5 = new Order(null, Instant.parse("2019-08-19T12:32:25Z"), OrderStatus.CANCELED,u4); 

		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5));
	}

}
