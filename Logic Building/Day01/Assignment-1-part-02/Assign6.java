 /*
 Write a Java program that calculates the area of a rectangle using the formula 
 area = length * width. Use predefined values for length and width.
 */

import java.util.*;
class Assign6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rect: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rect: ");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("Area of square is "+ area);
    }
}