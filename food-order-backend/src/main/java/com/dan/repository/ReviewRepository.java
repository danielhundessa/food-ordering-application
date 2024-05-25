package com.dan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dan.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
