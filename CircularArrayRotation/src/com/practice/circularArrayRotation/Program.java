/*
John Watson performs an operation called a right circular rotation on an array of integers, [a0, a1, …an-1]. After performing one right circular rotation operation, the array is transformed from, [a0, a1, …an-1]   to, [an-1,a0,…an-2] .
Watson performs this operation k times. To test Sherlock's ability to identify the current element at a particular position in the rotated array, Watson asks q queries, where each query consists of a single integer, m, for which you must print the element at index m in the rotated array (i.e., the value of am ).
Input Format
The first line contains 3 space-separated integers, n, k, and q, respectively. 
The second line contains n space-separated integers, where each integer i describes array element ai (where 0 <= I <n). 
Each of the q subsequent lines contains a single integer denoting m.
Constraints
•	1 < = n < = 10^5
•	1 <= ai <= 10^5
•	1 <= k <=10^5
•	1<=q<=500
•	0<=m<=N-1
Output Format
For each query, print the value of the element at index m of the rotated array on a new line.


 */
package com.practice.circularArrayRotation;

import java.util.Scanner;


/**
 *
 * @author chira
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int z = k%n;
        int counter = 0;    
        int counter1 = 0;
        
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        //Sets values according to the number of rotations(which need to be brough infront)
        for(int i = (n-z); i < n; i++){
        b[counter] = a[i];
            counter++;
        }
        //Sets values normally after arranging the values that needed to be brought infront
        for(int i = counter; i < n; i++){
            b[i] = a[counter1];
            counter1++; 
        }
        
     
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(b[m]);
           }
        
    }
    
}
