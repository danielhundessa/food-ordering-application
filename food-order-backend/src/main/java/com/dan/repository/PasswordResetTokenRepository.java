package com.dan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dan.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
