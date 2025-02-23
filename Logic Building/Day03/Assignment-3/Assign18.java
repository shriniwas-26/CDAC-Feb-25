/*
 Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
  ***** 
   *** 
    *

*/

class Assign18{
	public static void main(String[] args){
		int n = 4;
		// for first half
		for(int i=1; i<=n; i++){
			// for spaces
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			// for first half stars
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			// for final stars
			for(int l=1; l<=i-1; l++){
				System.out.print("*");
			}
			System.out.println();
		}

		// for second half
		for(int i=n-1; i>=1; i--){
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			for(int k=1; k<=i-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}