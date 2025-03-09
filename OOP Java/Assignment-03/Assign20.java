/*20.  Sum of Two Matrices 
○  Given two matrices of the same size, compute their sum.
*/
class Assign20{
	public static void main(String[] args){
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{11,12,13},{14,15,16},{17,18,19}};
		int[][] sum = new int[arr1.length][arr1[0].length];
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr1[i].length; j++){
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		for(int x[] : sum){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}