package com.Ecommerce.EcommerceWebsite;



import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClothingRepository extends JpaRepository<ClothingItem, Long> {
    List<ClothingItem> findByNameContainingIgnoreCase(String name);
}
