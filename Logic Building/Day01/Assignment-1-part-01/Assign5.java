// Write a Java program that takes two numbers as input and displays the product of the two numbers.

import java.util.*;
class Assign5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		int multiply = a * b;
		System.out.println(a + " x " + b + " = " + a*b);
	}
}