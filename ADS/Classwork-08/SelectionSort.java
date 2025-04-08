class SelectionSort{
	static void selSort(int arr[]){
		int min;
		for(int i=0; i<arr.length-1; i++){
			min = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[min]>arr[j]){
					min = j;
				}
			}
			if(min != i){
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
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
		selSort(arr);
		display(arr);
	}
}