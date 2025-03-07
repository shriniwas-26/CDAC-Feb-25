/*2.  Reverse an Array 
  Reverse the given array in place. 
*/
class Assign02{
	public static void main(String[] args){
		int[] arr = {30,24,37,46,21,56,44,32};
		int[] tarr = arr.clone();
		
		int s = 0;
		int e = arr.length-1;
		
		while(s<e){
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		
		System.out.println("original array-------------");
		for(int x : tarr){
			System.out.print(x+ " ");
		}
		System.out.println();
		System.out.println("reversed array-------------");
		for(int y : arr){
			System.out.print(y+ " ");
		}
	}
}