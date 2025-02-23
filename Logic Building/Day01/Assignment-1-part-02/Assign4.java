/* 
Write a Java program that displays a "Good Morning" message if the 
predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic.
*/

import java.util.*;
class Assign4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time: ");
		int time = sc.nextInt();
		System.out.print("AM or PM: ");
		String interval = sc.next().toLowerCase();
		System.out.println(interval);

		if(((time>=5 || time<=11) && interval.equals("am")) || (time==12 && interval.equals("pm"))){
			System.out.println("Good Morning.");
		}else{
			System.out.println("not Good Morning.");
		}
		
	}
}