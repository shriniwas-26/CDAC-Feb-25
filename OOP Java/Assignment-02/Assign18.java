/* 
Q18:  Given a student’s percentage, print  Pass  if the percentage is 40 or above; 
otherwise, print  Fail  , using only the ternary operator.
*/
import java.util.Scanner;
class Assign18{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your % in integer: ");
		int p = sc.nextInt();
		
		String res = p>=40? "Pass" : "Fail";
		System.out.println("Student is "+res);
	}
}