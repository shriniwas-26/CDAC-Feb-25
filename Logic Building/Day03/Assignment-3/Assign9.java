/*
Write a program to find and print the largest digit in the number 4825.
*/

class Assign9{
	public static void main(String[] args){
		int n = 4825;
		int temp = n;
		int large = 0;
		while(temp>0){
			int rem = temp%10;
			if(large<rem){
				large = rem;
			}
			temp = temp/10;
		}
		System.out.println("The largest digit in the number "+n+ " is "+large);
	}
}