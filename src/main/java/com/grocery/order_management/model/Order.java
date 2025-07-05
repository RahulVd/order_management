package com.grocery.order_management.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.processing.Generated;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @ManyToOne
   @JoinTable(name = "customer_id")
   private Customer customer;

   @ManyToMany
   @JoinTable(name = "order_items", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
   private List<GroceryItem> items;

   private LocalDateTime orderDate;

   private Double totalPrice;

}
