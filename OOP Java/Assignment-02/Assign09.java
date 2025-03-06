 /* Implement a Java program that checks if a number is  within a specific range (20 to 50)  without using  if-else
*/
import java.util.Scanner;
class Assign09{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println((num>=20 && num<=50)? num+ " is within the range of 20 to 50": num+ " is not within the range of 20 to 50");
	}
} 