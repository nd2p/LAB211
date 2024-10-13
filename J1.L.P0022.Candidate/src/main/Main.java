/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.CandidateMannager;
import utils.Validator;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CandidateMannager manage = new CandidateMannager();
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM\n"
                    + "1.	Experience\n"
                    + "2.	Fresher\n"
                    + "3.	Internship\n"
                    + "4.	Searching\n"
                    + "5.	Exit\n"
                    + " (Please choose 1 to Create Experience Candidate, "
                    + "2 to Create Fresher Candidate, 3 to Internship Candidate, "
                    + "4 to Searching and 5 to Exit program).");
            int userChoice = Validator.getInt("Enter choice: ", "Invalid choice!", "Invalid", 1, 5);
            switch (userChoice) {
                case 1:
                    manage.addCandidate(0);
                    manage.display();
                    break;
                    
                case 2:
                    manage.addCandidate(1);
                    manage.display();
                    break;
                    
                case 3:
                    manage.addCandidate(2);
                    manage.display();
                    break;
                
                case 4:
                    manage.searching();
                    break;
               
                case 5:
                    System.exit(0);
            }
        } while (true);
    }

}
