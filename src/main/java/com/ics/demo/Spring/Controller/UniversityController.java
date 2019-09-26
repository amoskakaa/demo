package com.ics.demo.Spring.Controller;

import com.ics.demo.Spring.Models.Student;
import com.ics.demo.Spring.Models.University;
import com.ics.demo.Spring.Services.UniversityService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="universities")
public class UniversityController {
    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }
    @GetMapping
    public List<University> findAll(){

        return universityService.findAll();
    }
    @GetMapping(value = "id")
    public University findById(@PathVariable Long id){

        return universityService.findById(id);
    }

    //29/08/2019
    @PostMapping
    public University createUniversity(@Validated(University.Create.class)@RequestBody University university){
    return universityService.createUniversity(university);
    }

    @DeleteMapping(value = "{id}")
    public void deleteUniversity(@PathVariable Long id){
        universityService.delete(id);
    }
    @PatchMapping
    public University updateUniversity(@Validated(University.Update.class)@RequestBody University university){
        return universityService.update(university);
    }
    @PatchMapping(value="{id}")
    public University updateUniversity(@PathVariable Long id, @RequestBody University university){
        return universityService.update(id,university);
    }
    @PostMapping(value = "{id}/students")
    public Student createStudent(@PathVariable Long id,
        @RequestBody Student student) {
        return universityService.createStudent(id,student);
    }
}
