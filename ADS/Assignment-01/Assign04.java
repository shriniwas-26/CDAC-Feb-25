class Assign04{
	static boolean isPrime(int n,int i){
		if(n%i==0 && i<n){
			return false;
		}else if(i==n){
			return true;
		}
		return isPrime(n,i+1);
	}
	
	static boolean isPalindrome(String str){
		if(str.length()<=1){
			return true;
		}
		if(str.charAt(0)!= str.charAt(str.length()-1)){
			return false;
		}
		return isPalindrome(str.substring(1,str.length()-1));
	}
	
	static int sumDig(int n){
		int sum = 0;
		if(n==0){
			return n;
		}
		sum+=n%10;
		return sum+sumDig(n/10);
	}
	
	static int fibo(int n){
		if(n<=1){
			return n;
		}
		
		return fibo(n-1)+fibo(n-2);
	}
	
	static int power(int a, int b){
		if(b==1){
			return a;
		}
		return a*power(a,b-1);
	}
	
	public static void main(String[] args){
		int num = 7;
		String str = "racecar";
		int n = 1234;
		int f = 6;
		int a = 2, b = 5;
		System.out.println("Is prime: "+isPrime(num,2));
		System.out.println("Is '"+str+"' a palindrome? = "+ isPalindrome(str));
		System.out.println("Sum of digits of "+n+": "+sumDig(n));
		System.out.println("Fibonacci("+f+"): "+fibo(f));
		System.out.println(a+"^"+b+" = "+power(a,b));
	}
}