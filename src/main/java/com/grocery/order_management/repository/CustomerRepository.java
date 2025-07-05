package com.grocery.order_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.order_management.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
