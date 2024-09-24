package com.Ecommerce.EcommerceWebsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class HealthContreoller {

    @GetMapping("/")
    public List<Map<String, Object>> searchClothing() {
        List<Map<String, Object>> clothingItems = new ArrayList<>();

        // Example data (you can replace this with a real database query later)
        if (true) {
            clothingItems.add(Map.of("name", "T-Shirt", "price", 19.99, "imageUrl", "http://localhost:8080/images/tshirt.jpg"));
            clothingItems.add(Map.of("name", "Jeans", "price", 49.99, "imageUrl", "http://localhost:8080/images/jeans.jpg"));
            clothingItems.add(Map.of("name", "Jacket", "price", 89.99, "imageUrl", "http://localhost:8080/images/jacket.jpg"));
        }

        return clothingItems;
    }

}
