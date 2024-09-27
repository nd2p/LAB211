/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entity.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utils.Validator;

/**
 *
 * @author admin
 */
public class StudentManager {

    private List<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public boolean isExisted(String id) {
        for (Student student : studentList) {
            if (student.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkValidCourse(Student student) {
        for (Student student1 : studentList) {
            if ((student1.getId().equalsIgnoreCase(student.getId())
                    && student1.getSemester() == student.getSemester())
                    && (student1.getCourseName().equalsIgnoreCase(student.getCourseName()))) {
                return false;
            }
        }
        return true;
    }

    public void sortStudentByName() {
        Collections.sort(studentList);
    }

    public void create() throws Exception {
        String choice;
        do {
            System.out.println("Input the " + (studentList.size() + 1) + " student:");
            Inputter inputter = new Inputter();
            Student student = inputter.inputStudentInfo(studentList);

            if (checkValidCourse(student)) {
                studentList.add(student);
            } else {
                System.out.println("This study history is existed!");
            }
            if (studentList.size() % 3 == 0) {
                choice = Validator.getString("Do you want to continue (Y/N)? Choose Y to continue,"
                        + " N to return main screen. Your choice: ", "Invalid", "[Yy|Nn]");
            } else {
                choice = "Y";
            }
        } while (choice.equalsIgnoreCase("Y"));
    }

    public void findAndSort() {
        sortStudentByName();

        String searchName = Inputter.capitalizeName(Validator.getString("Enter Name: ",
                "Name invalid", "[A-Za-z\\s]+"));
        for (Student student : studentList) {
            if (student.getName().contains(searchName)) {
                System.out.println(student);
            }
        }

    }

    public void updateOrDelete() {
        String searchID = Validator.getString("Enter id: ", "Invalid id", "^[Hh][Ee]\\d+").toUpperCase();
        ArrayList<Integer> indexOfFoundedStudent = new ArrayList<>();
        
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equalsIgnoreCase(searchID)) {
                System.out.println("Number " + i + ": " + studentList.get(i));
                indexOfFoundedStudent.add(i);
            }
        }

        System.out.println("Choose student number that you want to modify: ");
        int index = Validator.getIndex("Enter number: ", "Please choose correct number!",
                "Invalid number!", indexOfFoundedStudent);
        System.out.println("Do you want to update (U) or delete (D) student?");
        String choice = Validator.getString("Enter choice: ", "Invalid choice", "[UuDd]").toUpperCase();
        switch (choice) {
            case "U":
                Inputter inputter = new Inputter();
                Student student = inputter.inputStudentInfo(studentList);

                if (checkValidCourse(student)) {
                    studentList.remove(index);
                    studentList.add(index, student);
                } else {
                    System.out.println("This study history is existed!");
                }
                break;

            case "D":
                studentList.remove(index);
                break;
        }
    }

    public void report() {
        if (studentList.isEmpty()) {
            System.out.println("List is empty!");
        }
        sortStudentByName();
        String reportTitle = String.format("%15s | %15s | %20s", "Student Name", "Course", "Total of course");
        System.out.println(reportTitle);
        System.out.println("    ---------------------------------------------------");
        ReporterManager reportManager = new ReporterManager();
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            int total = 0;
            for (int j = i; j < size; j++) {
                if (studentList.get(i).getId().equalsIgnoreCase(studentList.get(j).getId())
                        && studentList.get(i).getCourseName()
                                .equalsIgnoreCase(studentList.get(j).getCourseName())) {
                    total++;
                }
            }
            Reportter reportter = new Reportter(studentList.get(i), total);
            reportManager.addReport(reportter);
        }

        for (Reportter report : reportManager.reportList) {
            System.out.println(String.format("%15s | %15s | %20s", report.getStudent().getName(),
                    report.getStudent().getCourseName(), report.getTotalOfCourse()));
        }
    }
}
