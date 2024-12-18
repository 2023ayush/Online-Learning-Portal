package com.Learning.repository;

import com.Learning.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

    // Find instructor by user ID
    Instructor findByUser_UserId(Long userId);
}