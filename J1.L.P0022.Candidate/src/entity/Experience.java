/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class Experience extends Candidate {

    private int yearOfExperience;
    private String proSkill;

    public Experience() {
    }

    public Experience(int yearOfExperience, String proSkill) {
        this.yearOfExperience = yearOfExperience;
        this.proSkill = proSkill;
    }

    public Experience(int yearOfExperience, String proSkill, String id, String firstName, String lastName, int birthDay, String address, String phone, String email, int type) {
        super(id, firstName, lastName, birthDay, address, phone, email, type);
        this.yearOfExperience = yearOfExperience;
        this.proSkill = proSkill;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
