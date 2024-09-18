/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class BinarySearch {

    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int binarySearch(int key, int[] array) {
        int[] sortedArray = array;
        int left = 0;
        int right = array.length;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
