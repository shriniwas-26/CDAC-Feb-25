/* Q6:  Write a program to find the  largest of three numbers  using only the  ternary operator
*/
class Assign06{
	public static void main(String args[]){
		int x = 15, y = 10, z = 17;
		int res = (x>y && x>z)? x: (y>z && y>x)? y : z;
		System.out.println(res+" is the largest number.");
	}
}