/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class Worker {

    private String id;
    private String name;
    private int age;
    private double salary;
    private String workLoca;

    public Worker() {
    }
    
    

    public Worker(String id, String name, int age, double salary, String workLoca) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLoca = workLoca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkLoca() {
        return workLoca;
    }

    public void setWorkLoca(String workLoca) {
        this.workLoca = workLoca;
    }

    @Override
    public String toString() {
        return "Worker[" + "ID: " + id + " | " + "Name: " + name + " | " + 
                "Age: "+ age + " | " + "Salary: " + salary + " | " + "Work Location: " +
                workLoca + ']';
    }

}
