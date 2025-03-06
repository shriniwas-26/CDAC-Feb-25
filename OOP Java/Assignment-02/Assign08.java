/*Q8:  Write a program that  takes three boolean inputs  and prints  true  if at least two of 
them are  true 
*/
import java.util.Scanner;
class Assign08{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st boolean value: ");
		boolean a = sc.nextBoolean();
		System.out.print("Enter 2nd boolean value: ");
		boolean b = sc.nextBoolean();
		System.out.print("Enter 3rd boolean value: ");
		boolean c = sc.nextBoolean();
		
		if(a && b || b && c || c && a){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
