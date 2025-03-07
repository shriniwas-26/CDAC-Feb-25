/* Q25:  Implement a program that reverses an  integer number  without using string 
conversion (  StringBuilder  or  toCharArray  ). 
Hint  : Use  while(n!=0) { rev = rev * 10 + n % 10; n /= 10; }
*/
import java.util.Scanner;
class Assign25{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while(temp>0){
			int r = temp%10;
			rev = rev*10+r;
			temp = temp/10;
		}
		System.out.println("Reverse of "+n+ " is "+rev);
	}
}