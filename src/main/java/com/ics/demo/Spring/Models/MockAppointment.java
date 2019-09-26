package com.ics.demo.Spring.Models;

public class MockAppointment {

    private Long id;
    private Long studentId;
    private Long teacherId;


    public MockAppointment(){

    }

    public MockAppointment(Long studentId, Long teacherId) {
        this.studentId = studentId;
        this.teacherId = teacherId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", StdNo='" + studentId + '\'' +
                ", Teacher='" + teacherId + '\'' +
                '}';
    }

}
