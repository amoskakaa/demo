package com.ics.demo.Spring.Repositories;

import com.ics.demo.Spring.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Long> {
}
