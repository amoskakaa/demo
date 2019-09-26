package com.ics.demo.Spring.Services;

import com.ics.demo.Spring.Models.Student;
import com.ics.demo.Spring.Models.University;
import com.ics.demo.Spring.Repositories.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService{

    private final UniversityRepository universityRepository;
    private final StudentService studentService;

    public UniversityServiceImpl(UniversityRepository universityRepository,StudentService studentService) {
        this.universityRepository = universityRepository;
        this.studentService = studentService;
    }

    @Override
    public List<University> findAll() {

        return universityRepository.findAll();
    }

    @Override
    public University findById(Long id) {

        return universityRepository.findById(id).get();
    }


//29/08/2019
    @Override
    public void delete(Long id) {
        universityRepository.deleteById(id);
    }

    @Override
    public University createUniversity(University university) {
        return universityRepository.save(university);
    }

    @Override
    public University update(University university) {

        University found  = findById(university.getId());
        found.setLocation(university.getLocation());
        found.setName(university.getName());
        found.setYear_founded(university.getYear_founded());
        return universityRepository.save(found);
    }

    @Override
    public University update(Long id,University university) {

        University found = findById(id);
        found.setLocation(university.getLocation());
        found.setName(university.getName());
        found.setYear_founded(university.getYear_founded());
        return universityRepository.save(found);
    }
// 05/08/2019
@Override
    public Student createStudent(Long id, Student student){
        University university = findById(id);
        student.setUniversity(university);
        return studentService.createStudent(student);
}

}
