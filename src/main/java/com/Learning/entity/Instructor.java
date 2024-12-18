package com.Learning.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Instructors")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long instructorId;

    private String name;
    private String bio;
    private String email;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL)
    private List<Course> courses;

    // Getters and Setters
}
