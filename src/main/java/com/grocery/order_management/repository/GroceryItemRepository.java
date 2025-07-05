package com.grocery.order_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.order_management.model.*;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {

}
