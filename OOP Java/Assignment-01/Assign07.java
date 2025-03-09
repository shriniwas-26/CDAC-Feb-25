/*7. Create a Java program to check whether a given number is even or odd using 
command-line arguments. 
*/
class Assign07{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		String ans = (num%2==0)? num+" is even." : num+" is odd.";
		System.out.println(ans);
	}
}