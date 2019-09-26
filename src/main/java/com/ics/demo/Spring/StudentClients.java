package com.ics.demo.Spring;

import com.ics.demo.Spring.Models.MockAppointment;
import com.ics.demo.Spring.Models.MockLecturer;
import com.ics.demo.Spring.Models.MockStudent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentClients implements CommandLineRunner {

    private final StudentClient studentClient;
    public StudentClients(StudentClient studentClient) {
        this.studentClient = studentClient;
    }





    @Override
    public void run(String... args) throws Exception {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<List<University>> response = restTemplate.exchange("http://10.51.10.111:9090/universities",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<University>>(){});
//        List<University> universities = response.getBody();

        //Register Student
        MockStudent regStudent = studentClient.registerStudent(new MockStudent("100020","Humphrey"));
        System.out.println("New Student:"+regStudent.toString());

        //View registered student
        MockStudent registered = studentClient.searchById(regStudent.getStudentNumber());
        System.out.println("Registered student:"+registered);

        //View lecturers
        List<MockLecturer> lecturers = studentClient.viewLecturers();
        System.out.println("Lecturers:"+lecturers);

        //Book appointment
//        MockAppointment book = studentClient.bookAppointment(new MockAppointment(regStudent.getId(), lecturers.get(0).getId()));
//        System.out.println("Booked Appointment:"+book.toString());

        MockAppointment book = studentClient.bookAppointment(new MockAppointment(regStudent.getId(), 2L));
        System.out.println("Booked Appointment:"+book.toString());

        //Confirm appointment
        MockAppointment confirm= studentClient.confirmAppointment(book.getId(), regStudent.getId());
        System.out.println("Confirmed Appointment:"+confirm);


    }
}
