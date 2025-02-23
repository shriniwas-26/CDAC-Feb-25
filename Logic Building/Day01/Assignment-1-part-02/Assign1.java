/*
Write a Java program that checks if a predefined number is positive using an 
if-else statement and prints the appropriate message.
*/

import java.util.*;

class Assign1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n>0){
            System.out.println(n+" is positive number");
        }else{
            System.out.println(n+" is not positive number");
        }
    }
}