/*
 This Program uses QuickSort Algorith to sort BigIntegers into ascending order.
 */
package com.practice.quickSort;

import java.math.BigInteger;

import java.util.Scanner;

/**
 *
 * @author chirag
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger [] numbers = new BigInteger[n];
        //Asks the user a list of unsorted numbers
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            numbers[unsorted_i] = in.nextBigInteger();
            
        }
        //Starting case for sorting
        int low_C = 0;
        int high_C = numbers.length - 1;
        
        //Calls the recursive function for Sorting
        quickSort(numbers, low_C, high_C);
        //Prints the sorted array 
        for(BigInteger i : numbers){
            System.out.println(i);
        }
    
    
    } 
    //This is the implementation of QuickSort Algorithm.
    public static void quickSort(BigInteger[] numbers, int low_C, int high_C) {
        if (numbers == null || numbers.length == 0) {
            return;
        }

        if (low_C >= high_C) {
            return;
        }

        int middle = low_C + (high_C - low_C) / 2;
        BigInteger pivot = numbers[middle];

        int low = low_C, high = high_C;
        while (low <= high) {
            while (numbers[low].compareTo(pivot) == -1) {
                low++;
            }
            while (numbers[high].compareTo(pivot) == 1) {
                high--;
            }
            if (low <= high) {
                BigInteger temp = numbers[low];
                numbers[low] = numbers[high];
                numbers[high] = temp;
                low++;
                high--;
            }
        }
        
        if (low_C < high) {
            quickSort(numbers, low_C, high);
        }
        if (high_C > low) {
            quickSort(numbers, low, high_C);
        }
    }
}
