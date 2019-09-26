package com.ics.demo.Spring.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "universities")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(groups=Update.class)
    @Column(name="id")
    private Long id;

    @NotNull(groups=Create.class)
    @Column(name = "name")
    private String name;

    @NotNull(groups=Create.class)
    @Column(name = "location")
    private String location;

    @Column(name = "year_founded")
    private String year_founded;

    @OneToMany(mappedBy = "university")
    private List<Student> students;


    public University(String name, String location, String year_founded) {
        this.name = name;
        this.location = location;
        this.year_founded = year_founded;
    }
    public University(){

    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYear_founded() {

        return year_founded;
    }

    public void setYear_founded(String year_founded) {

        this.year_founded = year_founded;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public interface Update{

    }
    public interface Create{

    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", year_founded='" + year_founded + '\'' +
                ", students=" + students +
                '}';
    }
}
