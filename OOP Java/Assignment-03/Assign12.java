/*12.  Write a program to accept 20 integer numbers in a single Dimensional Array. Find and 
Display the following: 
○  Number of even numbers. 
○  Number of odd numbers. 
○  Number of multiples of 3 
*/
import java.util.Scanner;
class Assign12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		
		int even = 0;
		int odd = 0;
		int c3 = 0;
		
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter arr["+i+"] number: ");
			arr[i] = sc.nextInt();
			if(arr[i]%2==0){
				even++;
			}else{
				odd++;
			}
			if(arr[i]%3==0){
				c3++;
			}
			
		}
		System.out.println("even: "+even);
		System.out.println("odd: "+odd);
		System.out.println("mult of 3: "+c3);
	}
}