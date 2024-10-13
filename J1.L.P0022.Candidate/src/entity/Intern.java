/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class Intern extends Candidate {

    private String majors;
    private String semester;
    private String university;

    public Intern() {
    }

    public Intern(String majors, String semester, String university) {
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }

    public Intern(String majors, String semester, String university, String id, String firstName, String lastName, int birthDay, String address, String phone, String email, int type) {
        super(id, firstName, lastName, birthDay, address, phone, email, type);
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
