import java.util.Scanner;
class RecurSum{
	static double calSum(int n){
		double sum=0.0;
		if(n<=1){
			return 1.0;
		}else{
			
			if(n%2==0){
				sum -= (double)1/n;
				
			}else{
				sum += (double)1/n;
				
			}
		}
		return sum+calSum(n-1);
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calSum(n));
	}
}