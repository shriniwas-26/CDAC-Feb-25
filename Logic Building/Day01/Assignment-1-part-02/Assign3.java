/*
Write a Java program that checks if a predefined number is odd or even. Use 
an if-else statement and the modulus operator (%) to determine whether the number is 
divisible by 2 or not.
*/

import java.util.*;
class Assign3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is even number");
        }else{
            System.out.println(n+" is odd number");
        }
    }
}
