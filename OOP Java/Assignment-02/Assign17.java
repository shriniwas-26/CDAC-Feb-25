/*Q17:  Implement a Java program that finds the  minimum of four numbers  using nested 
ternary operators. 
*/
class Assign17{
	public static void main(String[] args){
		int a=8, b=21, c=31, d=3;
		int ans = (a<b && a<c && a<d)? a : (b<a && b<c && b<d)? b : (c<a && c<b && c<d)? c : d;
		System.out.println(ans+" is minimum.");
	}
}