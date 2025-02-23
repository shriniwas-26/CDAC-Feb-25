// Write a Java program to calculate the average of three numbers.

import java.util.*;
class Assign13 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter third number: ");
		int c = sc.nextInt();

		double avg = (a + b + c)/3;
		System.out.println("The average is: "+ avg);
	}
}