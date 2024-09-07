/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import entity.Array;
import entity.LinearSearch;
import utils.Validator;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) throws Exception {
        int number = Validator.getInt("Enter number of array: ",
                "Please enter invalid number!",
                "Please enter a number", Integer.MIN_VALUE,
                Integer.MAX_VALUE);
        int key = Validator.getInt("Enter search value: ",
                "Please enter invalid number!",
                "Please enter a number", Integer.MIN_VALUE,
                Integer.MAX_VALUE);

        Array arr = new Array();
        int[] array = arr.generateRandomArray(number);
        LinearSearch search = new LinearSearch(array);
        System.out.println("The array: " + arr.toString());
        if (search.linearSearch(key) >= 0) {
            System.out.println("Found " + key + " at index: " + search.linearSearch(key));
        } else {
            System.out.println("Cannot find the search value!");
        }

    }
}
