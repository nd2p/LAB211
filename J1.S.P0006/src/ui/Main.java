/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import entity.Array;
import entity.BinarySearch;
import ulis.Validator;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) throws Exception {
        int number = Validator.getInt("Enter number of array: ",
                "Number out of range!", "Invalid number!",
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        int key = Validator.getInt("Enter search value: ",
                "Number out of range!", "Invalid number!",
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        Array array = new Array();
        int[] sortedArray = array.generateAndSortArray(number);
        BinarySearch search = new BinarySearch(sortedArray);
        System.out.println("Sorted array: " + array.toString());
        if (search.binarySearch(key, sortedArray) == -1) {
            System.out.println("Cant fint the given number!");
        } else {
            System.out.println("Found " + key + " at index: " + search.binarySearch(key, sortedArray));
        }
    }

}
