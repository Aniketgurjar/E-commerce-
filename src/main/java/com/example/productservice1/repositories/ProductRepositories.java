package com.example.productservice1.repositories;

import com.example.productservice1.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositories extends JpaRepository<Product,Long> {
Product save(Product p);
}
