package com.jrobertoprojects.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrobertoprojects.cursospringboot.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
