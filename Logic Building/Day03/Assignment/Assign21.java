/*
Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9

*/

class Assign21{
	public static void main(String[] args){
		int n = 5;
		for(int i=1; i<=n; i++){
			int c = 1;
			for(int j=1; j<=i; j++){
				System.out.print(c);
				if(j<i){
					System.out.print("*");
				}
				c+=2;
			}
			System.out.println();
		}
	}
}