// Write a Java program that takes three numbers as input and finds the largest of the three.

import java.util.*;
class Assign11 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter third number: ");
		int c = sc.nextInt();

		if(a>=b && a>=c){
			System.out.println("The largest number is " + a);
		}else if(b>=a && b>=c){
			System.out.println("The largest number is " + b);
		}else{
			System.out.println("The largest number is " + c);
		}
	}
}