package com.grocery.order_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.order_management.repository.GroceryItemRepository;

import jakarta.persistence.EntityNotFoundException;
import com.grocery.order_management.model.GroceryItem;

@Service
public class GroceryItemService {

    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public Optional<GroceryItem> getById(Long id) {

        return groceryItemRepository.findById(id);

    }

    public GroceryItem createItem(GroceryItem item) {

        return groceryItemRepository.save(item);
    }

    public List<GroceryItem> getAllItems() {
        return groceryItemRepository.findAll();
    }

    public GroceryItem updateItem(Long id, GroceryItem updatedItem) {
        GroceryItem existing = getById(id)
                .orElseThrow();
        existing.setName(updatedItem.getName());
        existing.setCategory(updatedItem.getCategory());
        existing.setPrice(updatedItem.getPrice());
        existing.setQuantity(updatedItem.getQuantity());
        return groceryItemRepository.save(existing);
    }

    public void deleteItem(Long id) {
        groceryItemRepository.deleteById(id);
    }
}
