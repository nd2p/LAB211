/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import utils.Validator;

/**
 *
 * @author admin
 */
public class Menu {
    
    public static int displayMenuAndInputChoice(){
        System.out.println("WELCOME TO STUDENT MENAGEMENT");
        System.out.println("        1. Create");
        System.out.println("        2. Find and Sort");
        System.out.println("        3. Update/Delete");
        System.out.println("        4. Report");
        System.out.println("        5. Exit");
        System.out.println("(Please choose 1 to Create, 2 to Find and Sort, "
                + "3 to Update/Delete, 4 to Report and 5 to Exit program).");
        int choice = Validator.getInt("Enter your choice: ", "Invalid Method!", "Invalid number!", 1, 5);
        return choice;
    }
}
