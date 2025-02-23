// Write a Java program to convert a temperature from Celsius to Fahrenheit. 

import java.util.*;
class Assign18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in Celsius: ");
        int c = sc.nextInt();
        double f = (double) (c * 9/5) + 32;

        System.out.println(c +"C is equal to "+ f + "F");
    }
}