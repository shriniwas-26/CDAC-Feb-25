/*
 Write a program that acts as a simple calculator. It should accept two numbers and an operator 
 (+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if
 else to check if division by zero is attempted and display an error message. 
 */

import java.util.*;
class Assign3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter operation to perform: ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("sum: " + (a+b));
                break;
            case '-':
                System.out.println("subtraction: " + (a-b));
                break;
            case '*':
                System.out.println("multiplication: " + (a*b));
                break;
            case '/':
                if(b==0){
                    System.out.println("Error: cannot divide by 0");
                    break;
                }else{
                    System.out.println("division: " + (a/b));
                    break;
                }
            default:
                System.out.println("Invalid operation");
                break;
            
        }
    }
}