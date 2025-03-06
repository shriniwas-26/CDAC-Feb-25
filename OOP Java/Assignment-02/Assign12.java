/*Q12:  Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
Hint  : Use bitwise left shift (  <<  ). 
*/
import java.util.Scanner;
class Assign12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int ans = n<<3;
		System.out.println(n+ " X "+8+ " = "+ans);
	}
}