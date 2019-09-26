package com.ics.demo.Spring.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NotNull(groups = Update.class)
    @Column(name="id")
    private Long id;

    @NotNull(groups = Create.class)
    @Column(name = "first_name")
    private String first_name;

    @NotNull(groups = Create.class)
    @Column(name = "last_name")
    private String last_name;

    @Column(name = "middle_name")
    private String middle_name;

    @Column(name = "dob")
    private String dob;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="university_id")
    private University university;

    public Student(){

    }
    public Student(String first_name, String last_name, University university) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setUniversity(University university) {
    }

    public interface Update{
    }

    public interface Create{
    }
}
