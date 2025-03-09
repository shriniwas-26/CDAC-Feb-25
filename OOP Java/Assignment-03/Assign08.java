/*8.  Merge Two Sorted Arrays 
○  Merge two sorted arrays into a single sorted array without using extra space.
*/
class Assign08{
	public static void main(String[] args){
		int arr1[] = {2,4,6,8,0,0,0,0,0};
		int arr2[] = {5,7,8,9,10};
		
		mergeSort(arr1,arr2);
		
		for(int x: arr1){
			System.out.print(x+ " ");
		}
		
	}
	static void mergeSort(int arr1[], int arr2[]){
		int m=3, n=arr2.length-1, track=arr1.length-1;
		while(m>=0 && n>=0){
			if(arr1[m]>arr2[n]){
				arr1[track--]=arr1[m--];
			}else{
				arr1[track--]=arr2[n--];
			}
		}
		while(n>=0){
			arr1[track--]=arr2[n--];
		}
		
	}
}