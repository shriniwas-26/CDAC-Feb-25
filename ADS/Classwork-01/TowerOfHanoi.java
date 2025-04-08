import java.util.Scanner;
class TowerOfHanoi{
	static void TOH(int n, char s, char i, char d){
		if(n==1){
			System.out.println("Disc 1st from "+s+" to "+d);
			return;
		}
		TOH(n-1,s,d,i);
		System.out.println("Disc "+n+" from "+s+" to "+d);
		TOH(n-1,i,s,d);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TOH(n,'S','I','D');
	}
	
}