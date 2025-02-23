// Write a Java program to find the factorial of a number.

import java.util.*;
class Assign15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++){
			fact = fact * i;
		}
		System.out.println("Factorial of "+ n + " is "+ fact);
	}
}