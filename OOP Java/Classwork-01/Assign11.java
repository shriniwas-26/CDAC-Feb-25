// 11. Write a program to check if a number is positive and even using logical operators (&&, ||, !).
import java.util.Scanner;
class Assign11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		if(a>0 && a%2==0 && !(a<0)){
			System.out.println(a + " is positive and even.");
		}else{
			System.out.println(a + " is not positive or not even.");
		}
	}
}