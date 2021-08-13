package com.practice.service.customerrewards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.service.customerrewards.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	// for now Default methods are used here

}
