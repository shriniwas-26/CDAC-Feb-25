// Write a Java program that calculates the area of a circle.

import java.util.*;
class Assign9 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int r = sc.nextInt();
		double area = 3.1415 * (r * r);
		System.out.println("Area of circle: " + area);
		
	}
}