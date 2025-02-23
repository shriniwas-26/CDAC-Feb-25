/*
 Write a program to calculate the sum of the first 50 natural numbers.
*/

class Assign1{
	public static void main(String[] args){
		int sum = 0;
		for(int i=1; i<=50; i++){
			sum+=i;
		}
		System.out.println("sum of 1 to 50 : "+ sum);
	}
}