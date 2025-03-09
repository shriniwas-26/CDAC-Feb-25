/* 2. Write a Java program that takes two integers as input and performs all arithmetic 
operations on them.
*/
import java.util.Scanner;
class Assign02{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println(a+" + "+b+": "+(a+b));
		System.out.println(a+" - "+b+": "+(a-b));
		System.out.println(a+" X "+b+": "+(a*b));
		System.out.println(a+" / "+b+": "+(a/b));
		System.out.println(a+" % "+b+": "+(a%b));
	}
}