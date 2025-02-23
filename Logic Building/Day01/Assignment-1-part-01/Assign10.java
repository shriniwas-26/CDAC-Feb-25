// Write a Java program that checks if a number is even or odd. 

import java.util.*;
class Assign10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if(n%2==0){
			System.out.println("The number "+ n + " is Even");
		}else{
			System.out.println("The number "+ n + " is Odd");
		}

	}
}