/*
Write a Java program that counts the number of digits in a given number. 
*/

import java.util.*;
class Assign20{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int temp= n;
		int count = 0;
		while(temp>0){
			count++;
			temp = temp/10;
		}
		System.out.println("The number "+ n + " has "+ count + " digits");
	}
}