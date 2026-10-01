package com.example.demo.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
