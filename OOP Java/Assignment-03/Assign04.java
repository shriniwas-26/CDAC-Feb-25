/*4.  Count Even and Odd Numbers 
○  Count the number of even and odd numbers in an array.
*/
class Assign04{
	public static void main(String[] args){
		int[] arr = {56,30,24,37,46,21,44,32};
		int even = 0;
		int odd = 0;
		for(int x : arr){
			if(x%2==0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("even : "+even);
		System.out.println("odd : "+odd);
	}
}