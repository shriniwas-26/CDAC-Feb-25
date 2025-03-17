// 4. Write a program to calculate the average of three int numbers using typecasting to display the result in double.
import java.util.Scanner;
class Assign4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter third number: ");
		int c = sc.nextInt();
		double avg = (double) (a+b+c)/3;
		System.out.println("Enter average of three numbers: "+avg);
	}
}