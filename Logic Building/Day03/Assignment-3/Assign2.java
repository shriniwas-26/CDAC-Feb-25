/*
Write a program to compute the factorial of the number 10. 
*/

class Assign2{
	public static void main(String[] args){
		int fact = 1;
		for(int i=1; i<=10; i++){
			fact = fact * i;
		}
		System.out.println("Factorial of 10 is "+ fact);
	}
}