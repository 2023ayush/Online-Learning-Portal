package com.Learning.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String name;
    private String description;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Course> courses;

    // Getters and Setters
}