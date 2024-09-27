/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entity.Student;
import java.util.List;
import utils.Validator;

/**
 *
 * @author admin
 */
public class Inputter {

    private Student student;

    public static String capitalizeName(String name){
        String[] words = name.toLowerCase().trim().split("\\s+");
        StringBuilder rightName = new StringBuilder();
        for (String word : words) {
            rightName.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return rightName.toString().trim();
    }
    
    public Student inputStudentInfo(List<Student> studentList) {
        // Get student ID and convert it to uppercase
        String id = Validator.getString("Enter ID: ", "Invalid id", "^[Hh][Ee]\\d+").toUpperCase();

        String name = null;
        // Check if student with the entered ID already exists in the list
        for (Student student1 : studentList) {
            if (student1.getId().equalsIgnoreCase(id)) {
                // If student is found, use the existing name
                System.out.println("Name: " + student1.getName());
                name = student1.getName();
                break;  // Stop searching once the student is found
            }
        }

        // If student is not found, prompt for name
        if (name == null) {
            name = Validator.getString("Enter Name: ", "Name invalid", "[A-Za-z\\s]+");
        }
        
        name = capitalizeName(name);
        
        // Get semester and course name
        int semester = Validator.getInt("Enter Semester: ",
                "Semester is not available!", "Invalid number!", 1, Integer.MAX_VALUE);
        String courseName = Validator.getString("Enter Course: ", "Course is not supported",
                "Java|\\.Net|C/C\\+\\+");

        // Return a new Student object with the entered/selected information
        return new Student(id, name, semester, courseName);
    }

}
