package com.ics.demo.Spring.Models;

import javax.persistence.*;


    @Entity
    @Table(name = "courses")
    public class Course {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;


        @Column(name = "name")
        private String name;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void addStudent(Student student) {
        }
    }

