package com.example.demo.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
