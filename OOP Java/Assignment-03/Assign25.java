/*25.  Find the Diagonal Sum 
○  Compute the sum of both diagonals in a square matrix.
*/
class Assign25{
	public static void main(String[] args){
		int dsum1=0;
		int dsum2=0;
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int n = arr.length;
		
		for(int i=0; i<n; i++){
			dsum1 += arr[i][i];
			dsum2 += arr[i][n-i-1];
		}
		
		System.out.println("Diagonal 1 sum: "+dsum1);
		System.out.println("Diagonal 2 sum: "+dsum2);
		System.out.println("All Diagonal sum: "+(dsum1+dsum2));
	}
}