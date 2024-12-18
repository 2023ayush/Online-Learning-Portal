package com.Learning.repository;

import com.Learning.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


    // Find category by name
    Category findByName(String name);
}