//29/08/2019
package com.ics.demo.Spring.Services;

import com.ics.demo.Spring.Models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);

    void delete(Long id);
    Student createStudent(Student student);
    Student update(Student student);
    Student update(Long id, Student student);


}
