/*
Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression 
*/

class Assign11{
	public static void main(String[] args){
		int i = 10;
		int ans = ++i + i--;
		System.out.println("if i=10 then ++i + i-- = "+ans);
	}
}