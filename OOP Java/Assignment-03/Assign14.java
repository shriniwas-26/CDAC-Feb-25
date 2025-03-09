/*14.  Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer 
and store all the even numbers in an array even[ ] and all the odd numbers in another array 
odd[ ]. Finally, print the elements of the even & the odd array. 
*/
import java.util.Scanner;
class Assign14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		int e = 0;
		int o = 0;
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter number: ");
			arr[i] = sc.nextInt();
			if(arr[i]%2==0){
				e++;
			}else{
				o++;
			}
		}
		int even[] = new int[e];
		int odd[] = new int[o];
		
		int i=0;
		int j=0;
		
		for(int x=0; x<arr.length; x++){
			if(arr[x]%2==0){
				even[i] = arr[x];
				i++;
			}else{
				odd[j] = arr[x];
				j++;
			}
		}
		
		System.out.println("------ Even Array Elements -----");
		for(int x : even){
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("------ Odd Array Elements -----");
		for(int x : odd){
			System.out.print(x+" ");
		}
	}
}