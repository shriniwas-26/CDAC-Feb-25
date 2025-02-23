/*
Write a program to find and print the first 5 prime numbers.
*/

class Assign6{
	public static boolean isPrime(int n) {
        	if (n < 2) return false;
        	for (int i = 2; i * i <= n; i++) {
           		if (n % i == 0) return false;
        	}
        	return true;
    	}

	public static void main(String[] args){
		int count = 0;
		int num = 2;
		
		while(count<5){
			if(isPrime(num)){
				System.out.print(num + " ");
				count++;
			}
			num++;
		}
	}
}