/*Q16:  Write a program that determines whether a given number is  positive, negative, or 
zero  using only the  ternary operator  . 
*/
import java.util.Scanner;
class Assign16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println((n>0)? n+" is positive.": (n<0)? n+" is negative.": n+" is zero.");
	}
}