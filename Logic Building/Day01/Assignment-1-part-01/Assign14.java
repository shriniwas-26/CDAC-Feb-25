// Write a Java program to print the Fibonacci series up to the 10th number.

import java.util.*;
class Assign14 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int n1=0, n2=1;

		for(int i=1; i<=n; i++){
			System.out.print(n1+ " ");
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3;
		}
	}
}