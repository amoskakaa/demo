package com.ics.demo.Spring.Repositories;

import com.ics.demo.Spring.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
