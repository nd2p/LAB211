/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import control.Controller;
import entity.SalaryHistory;
import entity.Worker;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Controller control = new Controller();
        do {
            int choice = Validator.getInt("======== Worker Management =========\n"
                    + "1.Add Worker\n"
                    + "2.Up salary\n"
                    + "3.Down salary\n"
                    + "4.Display Information salary\n"
                    + "5.Exit\n"
                    + "Enter your choice: ", "Only accept from 1 to 5", "Invalid choice!", 1, 5);
            switch (choice) {
                case 1:
                    try {
                        Worker worker = control.addWorker();
                        System.out.println("Add successfully: " + worker);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 2:
                    try {
                        SalaryHistory changedSalary = control.upSalary();
                        System.out.println("Change successfully: " + changedSalary);
                    } catch (Exception ex) {
                       System.out.println(ex.getMessage());
                    }
                    break;

                case 3:
                    try {
                        SalaryHistory changedSalary = control.downSalary();
                        System.out.println("Change successfully: " + changedSalary);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                
                case 4:
                    try {
                        control.getInformatoinSalary();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                 
                case 5: 
                    System.exit(0);
            }
        } while (true);

    }

}
