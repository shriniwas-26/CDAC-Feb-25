/*6. Develop a program that takes user input for a character and prints whether it is a 
vowel or consonant. 
*/
import java.util.Scanner;
class Assign06{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char c = sc.next().toLowerCase().charAt(0);
		
		System.out.println((c=='a' || c=='e' || c=='i' || c=='o' || c=='u')? c+ " is a vowel" : c+ " is a consonant");
	}
}