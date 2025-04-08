class MergeSort{
	
	static void mergeSort(int arr[], int l, int r){
		if(l<r){
			int mid = l+(r-l)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	
	static void merge(int arr[], int l, int mid, int r){
		int n1 = mid-l+1;
		int n2 = r-mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0; i<n1; i++){
			L[i] = arr[l+i];
		}
		
		for(int j=0; j<n2; j++){
			R[j] = arr[mid+1+j];
		}
		
		int i=0, j=0;
		int k=l;
		
		while(i<n1 && j<n2){
			if(L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			}else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k] = R[j];
			j++;
			k++;
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
		int n = arr.length;
		display(arr);
		mergeSort(arr,0,n-1);
		display(arr);
	}
}