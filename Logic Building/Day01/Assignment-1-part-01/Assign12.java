// Write a Java program that takes a number as input and prints the reverse of that number.

import java.util.*;
class Assign12 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while(temp>0){
			int rem = temp % 10;
			rev = rev * 10 + rem;
 			temp = temp/10;
		}
		System.out.println("The reverse of " + n + " is " + rev);
	}
}