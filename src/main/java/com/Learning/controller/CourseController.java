package com.Learning.controller;

import com.Learning.entity.Course;
import com.Learning.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Get courses by category ID
    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Course>> getCoursesByCategory(@PathVariable Long categoryId) {
        List<Course> courses = courseService.getCoursesByCategory(categoryId);
        return ResponseEntity.ok(courses);
    }

    // Get courses by instructor ID
    @GetMapping("/instructor/{instructorId}")
    public ResponseEntity<List<Course>> getCoursesByInstructor(@PathVariable Long instructorId) {
        List<Course> courses = courseService.getCoursesByInstructor(instructorId);
        return ResponseEntity.ok(courses);
    }

    /**
     * Save a course with a category ID.
     */
    @PostMapping("/{categoryId}")
    public ResponseEntity<Course> saveCourse(@PathVariable Long categoryId, @RequestBody Course course) {
        Course savedCourse = courseService.saveCourse(course, categoryId);
        return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
    }
}
