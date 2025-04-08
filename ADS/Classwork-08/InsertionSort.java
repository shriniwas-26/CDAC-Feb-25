class InsertionSort{

	static void iSort(int[] arr){
		int n = arr.length;
		for(int i=1; i<n; i++){
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	
	static void display(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int arr[] = {13,5,2,66,72,98,64};
		display(arr);
		iSort(arr);
		display(arr);
	}
}