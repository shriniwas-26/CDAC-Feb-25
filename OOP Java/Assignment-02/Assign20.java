/*
Q20:  Implement a Java program that  returns the absolute value  of a given number using 
the ternary operator (without using  Math.abs() 
*/
class Assign20{
	public static void main(String[] args){
		System.out.println(check(13));
		System.out.println(check(-16));
	}
	static String check(int x){
		int ans = 0;
		ans = (x<0)? -x : x;
		return "absolute value of "+x+" is "+ans;
	}
}