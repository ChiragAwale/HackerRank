/*
This program implements part of a raster graphics editor that takes the coordinates of a circle and a
square as input and draws them as filled-in shapes on a rectangular canvas.

Constaints:
A pixel should be black as a part of the circle if and only if the Euclidean distance from the pixel's
center to the center of the circle is not greater than r.

Input Format:
The first line contains two space-separated integers describing 
the respective values of  w(canvas width) and h(canvas height). 
The second line contains three space-separated integers describing the respective 
values of xcircle,ycircle , and defining a circle with radius r centered at xcircle and ycircle.

Output Format:
Prints h lines where each line contains w characters. Each character must be either a "." (to denote a white pixel)
or a "#" (to denote a black pixel).The first pixel of the first line of output corresponds
to the top-left corner of the canvas.
 */
package com.practice.circle;

import java.util.Scanner;

/**
 *
 * @author chirag
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int circleX = in.nextInt();
        int circleY = in.nextInt();
        int r = in.nextInt();
 
        double eucDis;
  
        for(int i = 0; i<h;i++){
            for(int j = 0; j<w; j++){
                eucDis = Math.sqrt(Math.pow(j-circleX,2)+Math.pow(i-circleY,2));
             
                if(!(eucDis>r)){
                    System.out.print("#");                 
                }else{
                    System.out.print(".");
                }
            }
            System.out.println(" ");
        }
    }
}


