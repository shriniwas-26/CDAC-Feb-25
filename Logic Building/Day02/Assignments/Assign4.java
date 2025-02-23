/*
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%.

*/

import java.util.*;
class Assign4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter purchase amount: ");
		double p = sc.nextDouble();
		double dis;
		System.out.print("Do you have membership card (true,false): ");
		boolean card = sc.nextBoolean();

		if(p>=1000){
			dis = p*0.20;
		}else if(p>=500){
			dis = p*0.10;
		}else{
			dis = p*0.05;
		}

		if(card){
			dis = dis + dis*0.05;
		}

		System.out.println("you have got discount of "+dis+" RS");
		
	}
}
