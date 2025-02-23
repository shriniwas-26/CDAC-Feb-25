/*
Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6). 
*/

class Assign7{
	public static void main(String[] args){
		int n = 9876;
		int temp = n;
		int sum = 0;
		while(temp>0){
			int rem = temp%10;
			sum+=rem;
			temp = temp/10; 
		}

		System.out.println("The sum of digits of "+n+ " is "+sum);
	}
}