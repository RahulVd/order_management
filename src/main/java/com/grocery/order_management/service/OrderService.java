package com.grocery.order_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grocery.order_management.model.Order;

import com.grocery.order_management.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> getById(Long id) {
        return orderRepository.findById(id);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public Order updateOrder(Long id, Order updatedOrder) {
        return orderRepository.findById(id).map(existingOrder -> {
            existingOrder.setCustomer(updatedOrder.getCustomer());
            existingOrder.setItems(updatedOrder.getItems());
            existingOrder.setOrderDate(updatedOrder.getOrderDate());
            existingOrder.setTotalPrice(updatedOrder.getTotalPrice());
            return orderRepository.save(existingOrder);
        }).orElseThrow(() -> new RuntimeException("Order not found"));
    }

}
