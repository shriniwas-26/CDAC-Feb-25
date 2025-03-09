/*22.  Find the Maximum Element in a Matrix 
○  Find the largest element in a given matrix.
*/
class Assign22{
	public static void main(String[] args){
		int arr[][] = {{2,8,4,},{46,12,40},{23,26,30}};
		int max = Integer.MIN_VALUE;
		
		for(int x[] : arr){
			for(int y : x){
				if(y>max){
					max = y;
				}
			}
		}
		
		System.out.println("Maximum element in the matrix = "+max);
	}
}