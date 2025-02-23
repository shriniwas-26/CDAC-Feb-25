// Write a Java program that takes a number as input and prints its multiplication table up to 10. 

import java.util.*;
class Assign7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to print table: ");
		int num = sc.nextInt();
		for(int i=1; i<=10; i++){
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}
}