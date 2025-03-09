/*19.  Transpose of a Matrix 
○  Given a matrix, return its transpose (swap rows and columns).
*/
class Assign19{
	public static void main(String[] args){
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int res[][] = new int[arr[0].length][arr.length];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				res[i][j] = arr[j][i];
			}
		}
		
		for(int x[] : res){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
} 