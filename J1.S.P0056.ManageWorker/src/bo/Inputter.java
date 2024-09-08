/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Worker;
import utils.Validator;

/**
 *
 * @author admin
 */
public class Inputter {
    
    private Worker worker;

    public Inputter() {
        worker = new Worker();
    }
    
    public Worker inputter(){
        worker.setId(Validator.getString("Enter Code: ", 
                "Code invalid!", "[Ww]\\d+").toUpperCase());
        worker.setName(Validator.getString("Enter Name: ", 
                "Name invalid", "[A-Za-z\\s]+"));
        worker.setAge(Validator.getInt("Enter age: ", 
                "Age must be from 18 to 50", "Invalid number!", 18, 50));
        worker.setSalary(Validator.getDouble("Enter salary: ", 
                "Salary must be greater than 0", 
                "Invalid number", Double.MIN_VALUE, Double.MAX_VALUE));
        worker.setWorkLoca(Validator.getString("Enter work location: ", 
                "Invalid!", "[A-Za-z0-9\\s]+"));
        return worker;
    }
    
}
