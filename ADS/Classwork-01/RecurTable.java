import java.util.Scanner;
class RecurTable{
	static void printTable(int n, int i){
		if(i==1){
			System.out.println(n+" * "+i+" = "+n*i);
			return;
		}
		printTable(n,i-1);
		System.out.println(n+" * "+i+" = "+n*i);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
			printTable(n,10);
		
	}
}