/*7.  Rotate an Array 
○  Rotate the array to the right by k positions.
*/
import java.util.Scanner;
class Assign07{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.print("Enter how much to rotate array: ");
		int k = sc.nextInt();
		System.out.println("Array before rotating---------");
		for(int x : arr){
			System.out.print(x+" ");
		}
		System.out.println();
		rotate(arr,k);
		System.out.println("Array after rotating by "+k+ "---------");
		for(int x : arr){
			System.out.print(x+" ");
		}
	}
	
	static void rotate(int arr[], int k){
		int n = arr.length;
		k = k%n;
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
	}
	
	static void reverse(int []arr, int s, int e){
		while(s<e){
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}
}