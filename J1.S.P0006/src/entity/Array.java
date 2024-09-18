/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Random;

/**
 *
 * @author admin
 */
public class Array {

    private int[] array;

    /*Function to generate random array that has the length being inputted from user*/
    public int[] generateAndSortArray(int number) throws Exception {
        if (number <= 0) {
            throw new Exception("An array can not have <=0 elements!");
        }
        array = new int[number];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
        return sortArray(array);
    }

    private int[] sortArray(int[] array) {
        int swap = 0;
        /*Declare a swap variable*/
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        return array;
    }
    
    /*Function to return a array in string*/
    @Override
    public String toString() {
        String string = "[";
        for (int i = 0; i < array.length; i++) {
            string += array[i];
            if (i == array.length - 1) {
                string += "]";
            } else {
                string += ", ";
            }
        }
        return string;
    }

}
