package com.example.demo.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
