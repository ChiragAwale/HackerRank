/*
This is just a solved solution to the problem in Hour Rank 16 contest of Hacker Rank
 */
package com.practice.candyPiles;

import java.util.Scanner;

/**
 *
 * @author Chirag Awale
 */
public class CandyPiles {

    /**
     *The question to this problem is included with the files.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int minimum;
        int chck = 0;
        int minPileCount = 0;
        int[] c = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        
        //Checks for the minimum value
        minimum = c[0]; 
        for (int c_i = 0; c_i < n; c_i++) {
            if (minimum > c[c_i]) {
                minimum = c[c_i];
            }
        }
        
        //Counts number of minimum values
        for (int c_i = 0; c_i < n; c_i++) {
            if (minimum == c[c_i]) {
                minPileCount++;
            }
        }
        
        //These if else conditions are for displaying correct outputs for different cases
        if (minPileCount == 1) {
            //This loop is for checking for a pile which has less candies after doubling another pile(with minimum candies)
            for (int c_i = 0; c_i < n; c_i++) {
                if ((c[c_i] < (2 * minimum)) && (c[c_i] * 2 != 2 * minimum)) {
                    minimum = c[c_i];
                    chck = 1;
                    break;
                }
            }
            if (chck == 1) {
                System.out.println((minimum) + " " + "1");
            } else {
                System.out.println((2 * minimum) + " " + "1");
            }
        } else {
            System.out.println(minimum + " " + n);
        }
    }

}
