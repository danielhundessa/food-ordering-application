package com.dan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dan.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
