/* Q22:  Implement a  calculator  that takes two numbers and an operator (  +  ,  -  ,  *  ,  /  ) as input 
and prints the result using only  switch-case 
*/
import java.util.Scanner;
class Assign22{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Enter operation (+,-,*,/): ");
		char c = sc.next().charAt(0);
		
		switch(c){
			case '+':
				System.out.println("Addition of "+a+ " and "+b+" is "+(a+b));
				break;
			case '-':
				System.out.println("Subtraction of "+a+ " and "+b+" is "+(a-b));
				break;
			case '*':
				System.out.println("Multiplication of "+a+ " and "+b+" is "+(a*b));
				break;
			case '/':
				System.out.println("Division of "+a+ " and "+b+" is "+(a/b));
				break;
			default:
				System.out.println("invalid operation");
		}
	}
}