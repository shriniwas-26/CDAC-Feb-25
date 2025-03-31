class Assign03{
	static int binarySearch(int[] arr, int key){
		int s = 0;
		int e = arr.length-1;
		while(s<=e){
			int mid = s + (e-s)/2;
			if(arr[mid] == key){
				return mid;
			}else if(arr[mid]>key){
				e = mid-1;
			}else{
				s = mid+1;
			}
		}
		return -1;
	}
	static int firstOccur(int[] arr, int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}
	static int lastOccur(int[] arr, int key){
		int last = -1;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == key){
				last = i;
			}
		}
		return last;
	}
	static int countKey(int[] arr, int key){
		int count = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == key){
				count++;
			}
		}
		return count;
	}
	static int peakVal(int[] arr){
		int peak = Integer.MIN_VALUE;
		for(int n: arr){
			if(n>peak){
				peak = n;
			}
		}
		return peak;
	}
	
	public static void main(String[] args){
		int[] arr = {1, 3, 3, 3, 5, 6, 8};
		int key = 3;
		int[] arr1 = {1, 2, 18, 4, 5, 0};
		System.out.println("Key found at index: "+binarySearch(arr,key));
		System.out.println("First occurrence: "+firstOccur(arr,key));
		System.out.println("Last occurrence: "+lastOccur(arr,key));
		System.out.println("Total count of key: "+ countKey(arr,key));
		System.out.println("Peak element: "+ peakVal(arr1));
	}
}