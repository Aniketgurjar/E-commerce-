package com.example.productservice1.repositories;

import com.example.productservice1.models.Category;
import org.hibernate.annotations.processing.Find;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository {

Category findByTitle(String title);

}
