 /* Write a program to swap two numbers  without using a third variable  and without 
using arithmetic operators like  +  or  -
*/
public class Assign01{
	public static void main(String[] args){
		int a = 4;
		int b = 6;
		System.out.println("Before Swapping: \nA = " + a + "\tB = " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swapping: \nA = " + a + "\tB = " + b);
	}
}