/*
 Write a program to print the following pattern: 
***** 
 **** 
  *** 
   ** 
    * 

*/

class Assign17{
	public static void main(String[] args){
		int n = 5;
		for(int i=1; i<=5; i++){
			// for spaces
			for(int j=1; j<=i-1; j++){
				System.out.print(" ");
			}
			// for stars
			for(int k=1; k<=n-i+1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}