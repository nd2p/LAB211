/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.Candidate;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import java.util.ArrayList;
import utils.Validator;

/**
 *
 * @author admin
 */
public class CandidateMannager {

    ArrayList<Candidate> candidateList;

    public CandidateMannager() {
        candidateList = new ArrayList<>();
    }

    public boolean isExist(String id) {
        for (Candidate candidate : candidateList) {
            if (candidate.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public static String capitalizeName(String name) {
        String[] words = name.toLowerCase().trim().split("\\s+");
        StringBuilder rightName = new StringBuilder();
        for (String word : words) {
            rightName.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return rightName.toString().trim();
    }

    public void addCandidate(int type) {
        String userChoiceOfContinue;
        do {
            String id = Validator.getString("Enter ID: ", "Invalid ID!", "^\\d{6}$");
            if (isExist(id)) {
                System.out.println("Candidate is existed!");
            } else {
                String firstName = capitalizeName(Validator.getString("Enter first name: ", "Invalid Name!", "[A-Za-z\\s]+"));
                String lastName = capitalizeName(Validator.getString("Enter last name: ", "Invalid Name!", "[A-Za-z\\s]+"));
                int birthDate = Validator.getInt("Enter year of birth: ", "Year is out of range!", "Invalid year!", 1900, 2024);
                String address = capitalizeName(Validator.getString("Enter address: ", "Invalid address", "[A-Za-z0-9\\s]+"));
                String phone = Validator.getString("Enter phone: ", "Invalid phone number", "^(09|03)\\d{8}$");
                String email = Validator.getString("Enter mail: ", "Invalid mail!", "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
                switch (type) {
                    case 0:
                        int expInYear = Validator.getInt("Enter number of year(0-100): ", "Year is out of range!", "Invalid year!", 0, 100);
                        String proSkill = capitalizeName(Validator.getString("Enter professionall skill: ", "Invalid Skill", "[A-Za-z\\s]+"));
                        Experience experience = new Experience(expInYear, proSkill, id, firstName, lastName, birthDate, address, phone, email, type);
                        candidateList.add(experience);
                        break;

                    case 1:
                        int graduationDate = Validator.getInt("Enter year of graduation: ", "Year is out of range!", "Invalid year!", 1900, 2024);
                        String graduationRank = capitalizeName(Validator.getString("Enter your rank: ", "Invalid rank!", "Excellence|Good|Fair|Poor"));
                        String education = capitalizeName(Validator.getString("Enter university name: ", "Invalid Name", "[A-Za-z\\s]+"));
                        Fresher fresher = new Fresher(graduationDate, graduationRank, education, id, firstName, lastName, birthDate, address, phone, email, type);
                        candidateList.add(fresher);
                        break;

                    case 2:
                        String major = capitalizeName(Validator.getString("Enter major: ", "Invalid major!", "[A-Za-z\\s]+"));
                        String semester = capitalizeName(Validator.getString("Enter semester: ", "Invalid semester!", "(Spring|Summer|Fall)\\d{2}"));
                        String educationIntern = capitalizeName(Validator.getString("Enter university name: ", "Invalid Name", "[A-Za-z\\s]+"));
                        Intern intern = new Intern(major, semester, educationIntern, id, firstName, lastName, birthDate, address, phone, email, type);
                        candidateList.add(intern);
                        break;
                }
            }
            System.out.println("Do you want to continue (Y/N)?");
            userChoiceOfContinue = Validator.getString("Enter your choice: ", "Invalid choice", "y|Y|n|N").toUpperCase();
        } while (userChoiceOfContinue.equalsIgnoreCase("Y"));
    }

    public boolean isExistByType(int type) {
        for (Candidate candidate : candidateList) {
            if (candidate.getType() == type) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        if (candidateList.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("===========EXPERIENCE CANDIDATE============");
        if (!isExistByType(0)) {
            System.out.println("Empty!");
        } else {
            for (Candidate candidate : candidateList) {
                if (candidate.getType() == 0) {
                    System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
                }
            }
        }

        System.out.println("===========FRESHER CANDIDATE============");
        if (!isExistByType(1)) {
            System.out.println("Empty!");
        } else {
            for (Candidate candidate : candidateList) {
                if (candidate.getType() == 1) {
                    System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
                }
            }
        }

        System.out.println("===========INTERN CANDIDATE============");
        if (!isExistByType(2)) {
            System.out.println("Empty!");
        } else {
            for (Candidate candidate : candidateList) {
                if (candidate.getType() == 2) {
                    System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
                }
            }
        }
    }

    public void searching() {
        if (candidateList.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        String searchName = capitalizeName(Validator.getString("Input Candidate name (First name or Last name): ", "Invalid Name!", "[A-Za-z\\s]+"));
        int searchType = Validator.getInt("Input type of candidate: ", "Invalid type!", "Invalid type!", 0, 2);

        int checkPoint = 0;
        for (Candidate candidate : candidateList) {
            if ((candidate.getFirstName().contains(searchName) && candidate.getType() == searchType)
                    || (candidate.getLastName().contains(searchName) && candidate.getType() == searchType)) {
                System.out.println(candidate.toString() + "|" + searchType);
                checkPoint++;
            }
        }
        if (checkPoint == 0) {
            System.out.println("Candidate can not be found!");
        }
    }
}
