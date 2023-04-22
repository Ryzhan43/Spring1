package com.example.repository;

import com.example.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    //find all courses by category
    List<Course> findByCategory(String category);

    //Find aa courses by category and order the entity by name
    List<Course> findByCategoryOrderByName(String category);

    //checks if the course with provided name exists. return true if course exist, false otherwise
    boolean existsByName(String name);

    //returns the counts of courses for the provided categories
    int countAllByCategory(String s);

    //find all courses that starts with the provided course name
    List<Course> findByNameStartingWith(String s);

}
