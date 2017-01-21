/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.workingWithMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author chira
 */
public class WorkingWithMaps {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        //Declaring the map
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        //Number of entries to be added to the map
        int n = in.nextInt();
        //Taking input for adding values to the map
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        //This function works while there is input
        while (in.hasNext()) {
            String s = in.next();
            //Retrieves value from the map and prints, prints not found if key does not exist
            if (phoneBook.get(s) != null) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
