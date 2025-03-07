/* Q21:  Write a program that  increments a number without using  +  or  ++  operators. 
Hint  : Use bitwise  - (~x) 
*/
import java.util.Scanner;
class Assign21{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int ans = -(~n);
		System.out.println("increment of "+n+ " is "+ans);
	}
}