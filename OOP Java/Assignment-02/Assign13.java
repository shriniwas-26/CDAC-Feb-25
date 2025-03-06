/*Q13:  Implement a Java program to find the  absolute value  of an integer using bitwise 
operators. 
*/
import java.util.Scanner;
class Assign13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int mask = n>>31;
		int abs = (n+mask)^mask;
		System.out.println("abs value of "+n+ " is "+abs);
	}
}