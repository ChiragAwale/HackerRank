/*
This program is just one way of solving the question on Hacker rank.
 */
package com.practice.hourGlassSum;

import java.util.Scanner;

/**
 *
 * @author Chirag Awale
 */
public class HourGlassSum {

    /**
     The question to this problem is included in the files.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSum = -999;                                                      //For storing minimum value
        int temp = 0;                                                           //For temporary sums
        int[][] a = new int[6][6];                                              //It can be any number of rows and colums(6,6) for this case
        
        //Takes input
        for (int i = 0; i < 6; i++) {                           
            for (int j = 0; j < 6; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        
        //Calculates and stores sums of the hourglass and compares them
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 6; j++) {
                temp = (a[i][j - 2] + a[i][j - 1] + a[i][j]) + (a[i + 1][j - 1]) + (a[i + 2][j - 2] + a[i + 2][j - 1] + a[i + 2][j]);
                if (temp > maxSum) {
                    maxSum = temp;
                }
            }
        }
        //Prints the maximum sum
        System.out.println(maxSum);
    }

}
