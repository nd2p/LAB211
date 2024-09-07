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

    private int[] arr;

    public int[] generateRandomArray(int number) throws Exception {
        if (number <= 0) {
            throw new Exception("The number of array's quantity must be greater than 0!");
        }
        arr = new int[number];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(arr.length);
        }
        return arr;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i == arr.length-1) {
                str += "]";
            } else {
                str += ", ";
            }
        }
        return str;
    }

}
