/*
Write a program to print all even numbers between 1 and 50. 
*/

class Assign10{
	public static void main(String[] args){
		int n = 50;
		for(int i=1; i<=n; i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}