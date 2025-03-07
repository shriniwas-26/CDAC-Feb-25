/*6.  Remove Duplicates from a Sorted Array 
○  Remove duplicate elements from a sorted array without using extra space
*/
class Assign06{
	public static void main(String[] args){
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
		int limit = removeDuplicate(arr);
		for(int i=0; i<limit; i++){
			System.out.print(arr[i]+ " ");
		}
		
	}
	static int removeDuplicate(int[] arr){
		if(arr.length == 0){
			return 0;
		}
		int ui = 0;
		for(int i=1; i<arr.length; i++){
			if(arr[i] != arr[ui]){
				ui++;
				arr[ui] = arr[i];
			}
		}
		return ui+1;
	}
}