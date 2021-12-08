package com.educandoweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.workshop.entities.Product;

//Registra como um Repositório que é injetado em outra Classe
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
