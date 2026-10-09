package com.example.demo.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entities.OrderItem;
import com.example.demo.models.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
