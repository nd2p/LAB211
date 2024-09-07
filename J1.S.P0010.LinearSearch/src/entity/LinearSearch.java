/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class LinearSearch {

    private int[] arr;

    public LinearSearch(int[] arr) {
        this.arr = arr;
    }

    public int linearSearch(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }

}
