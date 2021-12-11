package com.educandoweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.educandoweb.workshop.entities.OrderItem;

//Registra como um Repositório que é injetado em outra Classe
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
