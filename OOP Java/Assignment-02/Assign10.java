/*Q10:  Write a program to determine if a  character is a vowel  or a consonant using the 
ternary operator. 
*/
import java.util.Scanner;
class Assign10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char c = sc.next().toLowerCase().charAt(0);
		
		System.out.println((c=='a' || c=='e' || c=='i' || c=='o' || c=='u')? c+ " is a vowel" : c+ " is a consonant");
	}
}