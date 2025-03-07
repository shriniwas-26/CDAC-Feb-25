/*1.  Find the Largest and Smallest Element 
  Given an array, find the smallest and largest elements in it.
*/
class Assign01{
	public static void main(String[] args){
		int[] arr = {30,24,37,46,21,56,44,32};
		int s = arr[0];
		int l = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>l){
				l=arr[i];
			}
			if(arr[i]<s){
				s=arr[i];
			}
		}
		System.out.println("Smallest element: "+s);
		System.out.println("Largest element: "+l);
	}
}