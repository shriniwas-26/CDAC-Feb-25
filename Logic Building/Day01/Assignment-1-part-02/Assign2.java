/*
Write a Java program that checks if a predefined number is negative using an 
if-else statement and displays the result. 
*/

import java.util.*;

class Assign2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println(n+" is negative number");
        }else{
            System.out.println(n+" is not negative number");
        }
    }
}