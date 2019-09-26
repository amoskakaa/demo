package com.ics.demo.Spring.Services;

import com.ics.demo.Spring.Models.Student;
import com.ics.demo.Spring.Models.University;

import java.util.List;

public interface UniversityService {
    List<University> findAll();
    University findById(Long id);


    //29/08/2019
    void delete(Long id);
    University createUniversity(University university);
    University update(University university);
    University update(Long id, University university);

    Student createStudent(Long id, Student student);
}
