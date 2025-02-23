/*
Write a program to reverse the digits of the number 1234. The output should be 4321
*/

class Assign4{
	public static void main(String[] args){
		int n = 1234;
		int temp = n;
		int rev = 0;
		while(temp>0){
			int rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		System.out.println("The reverse of "+n+ " is "+rev);
	}
}