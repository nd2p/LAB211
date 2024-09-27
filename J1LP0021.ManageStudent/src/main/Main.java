/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Controller.StudentManager;
import ui.Menu;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) throws Exception {
        StudentManager manager = new StudentManager();
        do {
            int choice = Menu.displayMenuAndInputChoice();
            switch (choice) {
                case 1:
                    manager.create();
                    break;

                case 2:
                    manager.findAndSort();
                    break;

                case 3:
                    manager.updateOrDelete();
                    break;

                case 4:
                    manager.report();
                    break;
                    
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
