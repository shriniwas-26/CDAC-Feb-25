/*
Write a program to print the following pattern: 
********* 
******* 
***** 
*** 
* 
*** 
***** 
******* 
*********

*/

class Assign22{
	public static void main(String[] args){
		int n = 5;
		int c = 1+2*(n-1);
		// first half
		for(int i=1; i<=n; i++){
			for(int j=c; j>=1; j--){
				System.out.print("*");
			}
			c=c-2;
			System.out.println();
		}
		// last section
		int d = 3;
		for(int i=1; i<=n-1; i++){
			for(int j=d; j>=1; j--){
				System.out.print("*");
			}
			d=d+2;
			System.out.println();
		}
	}
}