/*
Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
*****
*/

class Assign12{
	public static void main(String[] args){
		int n = 5;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}