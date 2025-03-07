/*3. Find the Second Largest Element 
  Find the second-largest element in the given array. 
*/
class Assign03{
	public static void main(String[] args){
		int[] arr = {56,30,24,37,46,21,44,32};
		int large = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>large){
				secondLarge = large;
				large = arr[i];
			}else if(arr[i] > secondLarge && secondLarge < large){
				secondLarge = arr[i];
			}
		}
		System.out.println("Second Large : "+secondLarge);
	}
}