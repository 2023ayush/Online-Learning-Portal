package com.Learning.service;

import com.Learning.entity.Category;
import com.Learning.entity.Course;
import com.Learning.repository.CategoryRepository;
import com.Learning.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    // Get courses by category ID
    public List<Course> getCoursesByCategory(Long categoryId) {
        return courseRepository.findByCategory_CategoryId(categoryId);
    }

    // Get courses by instructor ID
    public List<Course> getCoursesByInstructor(Long instructorId) {
        return courseRepository.findByInstructor_InstructorId(instructorId);
    }

    // Create or update course
    /**
     * Save a course with an associated category.
     */
    public Course saveCourse(Course course, Long categoryId) {
        // Fetch the category from the database
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + categoryId));

        // Set the category to the course
        course.setCategory(category);

        // Save the course
        return courseRepository.save(course);
    }
}

