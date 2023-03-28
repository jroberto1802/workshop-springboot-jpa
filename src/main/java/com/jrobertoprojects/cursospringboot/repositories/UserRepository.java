package com.jrobertoprojects.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrobertoprojects.cursospringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
