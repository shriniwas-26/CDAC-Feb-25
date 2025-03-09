/*21.  Row-wise and Column-wise Sum 
○  Find the sum of each row and each column of a given matrix. 
*/
class Assign21{
	public static void main(String[] args){
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<arr.length; i++){
			int rsum=0;
			int csum=0;
			for(int j=0; j<arr[i].length; j++){
				rsum += arr[i][j];
				csum += arr[j][i];
			}
			System.out.println("row sum: "+rsum+", column sum: "+csum);
		}
		
	}
}