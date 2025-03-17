// 12. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.
import java.util.Scanner;
class Assign12{
	public static void main(String args[]){
		int a = 5;
		int b = 2;
		System.out.println("before: a = "+a);
		System.out.println("before: b = "+b);
		a += b;
		System.out.println("after a+=b : a = "+a);
		a -= b;
		System.out.println("after a-=b : a = "+a);
		a *= b;
		System.out.println("after a*=b : a = "+a);
		a /= b;
		System.out.println("after a/=b : a = "+a);
		a %= b;
		System.out.println("after a%=b : a = "+a);
	}
}