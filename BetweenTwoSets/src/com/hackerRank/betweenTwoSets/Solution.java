/*
The question to this solution is in the files folder.
 */
package com.hackerRank.betweenTwoSets;

import java.util.Scanner;

/**
 *
 * @author chira
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        //Total values that meet the condition
        int counter = 0;
        //Checker 
        boolean check = true;
        
        //For inputs
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        
        //Checks every number with both sets according to the rules and adds 1 to counter if all conditions are met
        for (int num = 1; num < 101; num++) {
            check = true;
            for (int a_i = 0; a_i < n; a_i++) {
                if (num % a[a_i] != 0) {
                    check = false;
                }
            }
            for (int b_i = 0; b_i < m; b_i++) {
                if (b[b_i] % num != 0) {
                    check = false;
                }

            }
            if (check == true) {
                counter++;
            }

        }
        System.out.println(counter);

    }
}
