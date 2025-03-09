/*23.  Matrix Multiplication 
○  Multiply two matrices and return the resultant matrix.
*/
class Assign23{
	public static void main(String[] args){
		int arr1[][] = {{1,2},{3,4}};
        int arr2[][] = {{1,1},{1,1}};
		
		int rowA = arr1.length;
		int colA = arr1[0].length;
		int colB = arr2[0].length;
		
		int res[][] = new int[rowA][colA];
		
		for(int i=0; i<rowA; i++){
			for(int j=0; j<colB; j++){
				for(int k=0; k<colA; k++){
					res[i][j] += arr1[i][k] * arr2[k][j];
				}
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