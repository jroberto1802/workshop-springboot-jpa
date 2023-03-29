package com.jrobertoprojects.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrobertoprojects.cursospringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
