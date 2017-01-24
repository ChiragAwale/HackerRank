/*
This simple program solves and prints Factorial, Combination and Permutation problems
 */
package com.practice.factorialCombinationPermutation;

import java.util.Scanner;

/**
 *
 * @author chirag
 */
public class FCP {

    public static void main(String[] args) {
        int n, k;
        Scanner scan = new Scanner(System.in);
        //Loop for executing program until user chooses to exit
        while (true) {
            menu();

            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Enter a number to calculate the factorial of");
                    n = scan.nextInt();
                    System.out.println("The factorial of " + n + " is " + factorial(n));
                    break;
                case 2:
                    System.out.println("Please enter the n & k of nPk respectively ");
                    n = scan.nextInt();
                    k = scan.nextInt();
                    while (n < k || k < 0 || n < 0) {
                        System.out.println("Please enter the n & k of nPk respectively(n>k>0) ");
                        n = scan.nextInt();
                        k = scan.nextInt();
                    }
                    System.out.println("The Permutation as in " + n + "P" + k + " is " + permutation(n, k));
                    break;
                case 3:
                    System.out.println("Please enter the n & k of nCk respectively ");
                    n = scan.nextInt();
                    k = scan.nextInt();
                    while (n < k || k < 0 || n < 0) {
                        System.out.println("Please enter the n & k of nCk respectively(n>k>0) ");
                        n = scan.nextInt();
                        k = scan.nextInt();
                    }
                    System.out.println("The Combination as in " + n + "c" + k + " is " + combination(n, k));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please try again");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Please choose an option to calculate");
        System.out.println("1.Factorial\n2.Permutation\n3.Combination\n4.Exit");

    }

    public static int factorial(int n) {
        //base case
        if (n <= 1) {
            return 1;
            //recursive case    
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int permutation(int n, int k) {
        //basic forumla of permuation
        return (factorial(n) / factorial(n - k));
    }

    public static int combination(int n, int k) {
        //basic formula of combination
        return (factorial(n) / (k * factorial(n - k)));
    }

}
