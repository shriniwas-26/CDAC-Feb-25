/*5. Find Sum and Average 
○  Compute the sum and average of all elements in the array. 
*/
class Assign05{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5,6};
		int sum = 0;
		double avg = 0.0;
		for(int x : arr){
			sum += x;
		}
		avg = (double)sum/arr.length;
		System.out.println("sum: "+sum);
		System.out.println("average: "+avg);
	}
}