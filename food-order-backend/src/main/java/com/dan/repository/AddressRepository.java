package com.dan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dan.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
