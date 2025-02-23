/*
Write a program to print the following pattern: 
    * 
   ** 
  *** 
 **** 
*****

*/

class Assign15{
	public static void main(String[] args){
		int n = 5;
		for(int i=1; i<=5; i++){
			// for spaces
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			// for stars
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}