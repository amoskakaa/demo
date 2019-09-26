package com.ics.demo.Spring.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "universities")
public class MockStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(groups=Update.class)
    @Column(name="id")
    private Long id;

    @NotNull(groups=Create.class)
    @Column(name = "studentNumber")
    private String studentNumber;

    @NotNull(groups=Create.class)
    @Column(name = "firstName")
    private String firstName;


    public MockStudent(String studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;

    }
    public MockStudent(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public interface Update{

    }
    public interface Create{

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", StdNo='" + studentNumber + '\'' +
                ", FirstName='" + firstName + '\'' +
                '}';
    }
}
