/*
Write a Java program that calculates the area of a square using the formula 
area = side * side. Use a predefined side length.
*/

import java.util.*;

class Assign5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("Area of square is "+ area);
    }
}