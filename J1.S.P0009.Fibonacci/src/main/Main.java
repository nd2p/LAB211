/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    ArrayList<Integer> fibonacciList = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        Main main = new Main();
        main.generateFibonacci(45);
        main.displayFibonaciiList();
    }

    public void displayFibonaciiList() {
        System.out.print("The fibonacii list are: ");
        for (int i = 0; i < fibonacciList.size(); i++) {
            if (i == fibonacciList.size() - 1) {
                System.out.print(fibonacciList.get(i) + ".");
            } else {
                System.out.print(fibonacciList.get(i) + ", ");
            }
        }
        System.out.println();
    }

    public void generateFibonacci(int number) {
        generateFibonacciByRecursive(number, 0, 1);
    }

    public void generateFibonacciByRecursive(int number, int current, int previous) {
        fibonacciList.add(current);
        number = number - 1;
        if (number >= 1) {
            int next = previous + current;
            generateFibonacciByRecursive(number, next, current);
        }
    }
}
