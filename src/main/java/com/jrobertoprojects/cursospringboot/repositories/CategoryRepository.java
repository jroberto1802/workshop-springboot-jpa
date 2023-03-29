package com.jrobertoprojects.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrobertoprojects.cursospringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
