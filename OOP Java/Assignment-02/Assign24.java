/* Q24:  Write a program that prints  all even numbers from 1 to 100  using only  bitwise AND 
(  &  )  and  for  loop.
*/
class Assign24{
	public static void main(String[] args){
		int s = 1;
		int e = 100;
		for(int i=s; i<=e; i++){
			if((i&1)==0){
				System.out.print(i+ " ");
			}
		}
	}
}