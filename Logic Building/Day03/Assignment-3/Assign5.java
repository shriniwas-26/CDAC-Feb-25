/*
Write a program to print the Fibonacci sequence up to the number 21. 
*/

class Assign5{
	public static void main(String[] args){
		int n = 21;
		int a = 0;
		int b = 1;
		
		for(int i=1; i<=n; i++){
			System.out.print(a+ " ");
			int c = a+b;
			a = b;
			b = c;
		}
	}
}