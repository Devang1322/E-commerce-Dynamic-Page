package com.Ecommerce.EcommerceWebsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ClothingController {

    @GetMapping("/search")
    public List<Map<String, Object>> searchClothing(@RequestParam String q) {
        List<Map<String, Object>> clothingItems = new ArrayList<>();
// this is the data if we want to upload we can upload
        if (q.length() > 3) {
            double conversionRate = 82.50;// this is used to covert price dollar into rupees
            clothingItems.add(Map.of("name", "T-Shirt", "price", 10* conversionRate, "imageUrl", "http://localhost:8080/images/tshirt.jpg"));
            clothingItems.add(Map.of("name", "Jeans", "price", 12* conversionRate, "imageUrl", "http://localhost:8080/images/jeans.jpg"));
            clothingItems.add(Map.of("name", "Jacket", "price", 13* conversionRate, "imageUrl", "http://localhost:8080/images/jacket.jpg"));
        }

        return clothingItems;
    }


}
