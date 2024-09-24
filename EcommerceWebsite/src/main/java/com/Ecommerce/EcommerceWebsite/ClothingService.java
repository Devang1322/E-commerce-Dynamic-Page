package com.Ecommerce.EcommerceWebsite;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClothingService {
    @Autowired
    private ClothingRepository clothingRepository;

    public List<ClothingItem> searchItems(String query) {
        if (query == null || query.trim().isEmpty()) {
            return List.of(); // Return an empty list if the query is empty
        }

        // Retrieve all clothing items from the repository and filter them based on the query
        List<ClothingItem> clothingItems = clothingRepository.findAll();

        return clothingItems.stream()
                .filter(item -> item.getName().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
