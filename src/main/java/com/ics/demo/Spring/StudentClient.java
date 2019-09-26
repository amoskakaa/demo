package com.ics.demo.Spring;

import com.ics.demo.Spring.Models.MockAppointment;
import com.ics.demo.Spring.Models.MockLecturer;
import com.ics.demo.Spring.Models.MockStudent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(name = "client", url = "http://10.50.35.47:1000",configuration = FeignConfig.class)
public interface StudentClient {
    //Method to register a new student
    @RequestMapping(method = RequestMethod.POST, value = "students")
    MockStudent registerStudent(@RequestBody MockStudent mockStudent);

    //Method to view registered student
    @RequestMapping(method = RequestMethod.GET, value = "students")
    MockStudent searchById(@RequestParam(value = "studentNumber") String number);

    //Method to view lectures
    @RequestMapping(method = RequestMethod.GET, value="lecturers")
    List<MockLecturer> viewLecturers();

    //Method to book an appointment
    @RequestMapping(method = RequestMethod.POST, value = "appointments")
    MockAppointment bookAppointment(@RequestBody MockAppointment mockAppointment);

    //Method to confirm an appointment
    @RequestMapping(method = RequestMethod.PATCH, value = "appointments/{id}")
    MockAppointment confirmAppointment(@PathVariable(name = "id") Long id, @RequestParam(value = "studentId")Long studentId);



}


