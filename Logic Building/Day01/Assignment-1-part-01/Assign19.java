 /*
 Write a Java program that calculates the power of a number. Take two numbers as input: the 
 base and the exponent, and compute the result of base raised to the power of exponent.
*/

import java.util.*;
import java.lang.*;

class Assign19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number: ");
        int b = sc.nextInt();
        System.out.println("Enter exponent number: ");
        int e = sc.nextInt();

        System.out.println(b + " raised to the power "+ e + " is "+ Math.pow(b,e));
    }
}