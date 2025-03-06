/* Write a program to find whether a given number is  divisible by 3  without using the 
modulus (  %  ) or division (  /  ) operators. 
*/
public class Assign04{
	public static void main(String[] args){
		int n = 15;
		
		if(n<0){
			n = -n;
		}
		
		while(n>3){
			n = (n & 3) + (n >> 2);
		}
		
		if(n==0 || n==3)
			System.out.println("Division by 3");
		else
			System.out.println("Not division by 3");
	
	}
}