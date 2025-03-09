/*9.  Find Missing Number in an Array 
○  Given an array of size n-1 containing numbers from 1 to n, find the missing number.
*/
import java.util.Scanner;
class Assign09{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,4,5,6};
		int n = arr.length+1;
		
		System.out.println("----------original array ----------");
		int totalsum = n*(n+1)/2;
		int arrSum = 0;
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
			arrSum += arr[i];
		}
		System.out.println();
		int missing = totalsum-arrSum;
		System.out.println("The missing number is "+missing);
		
		
		
		
	}
}