package com.dan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dan.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
