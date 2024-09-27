/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entity.Student;

/**
 *
 * @author admin
 */
public class Reportter {
    private Student student;
    private int totalOfCourse;

    public Reportter(Student student, int totalOfCourse) {
        this.student = student;
        this.totalOfCourse = totalOfCourse;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getTotalOfCourse() {
        return totalOfCourse;
    }

    public void setTotalOfCourse(int totalOfCourse) {
        this.totalOfCourse = totalOfCourse;
    }
    
    
}
