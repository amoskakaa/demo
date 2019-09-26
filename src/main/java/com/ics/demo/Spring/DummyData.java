package com.ics.demo.Spring;

import com.ics.demo.Spring.Models.Course;
import com.ics.demo.Spring.Models.Student;
import com.ics.demo.Spring.Models.University;
import com.ics.demo.Spring.Repositories.CourseRepository;
import com.ics.demo.Spring.Repositories.StudentRepository;
import com.ics.demo.Spring.Repositories.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {
    private final UniversityRepository universityRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;


    public DummyData(UniversityRepository universityRepository, StudentRepository studentRepository, CourseRepository courseRepository) {

        this.universityRepository = universityRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //Universities
       University nrb = new University("Strathmore","Ole sangale","2018");
       universityRepository.save(nrb);
        University kajiado = new University("Kajiado","Ole ","2020");
        universityRepository.save(kajiado);
       //Students
        Student first_year = new Student("Ian","Kinyua",nrb);
        first_year.setMiddle_name("Karanja");
        first_year.setDob("2020");
        studentRepository.save(first_year);

        Student second_year = new Student("Amos","Waithaka",nrb);
        studentRepository.save(second_year);

        Student third_year = new Student("James","Kamau",nrb);
        studentRepository.save(third_year);
        //Course
        Course course = new Course();
        courseRepository.save(course);

//        Course course1 = courseRepository.save(new Course("");


        Student student = new Student("","",nrb);
        course.addStudent(student);
        courseRepository.save(course);
    }
}
