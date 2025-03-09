// 3. Implement a Java program to demonstrate implicit and explicit type casting. 
class Assign03{
	public static void main(String args[]){
		int a = 10;
		double b = a;
		double c = 14.42322352;
		int d = (int) c;
		System.out.println("-----Implicit Typecasting-----");
		System.out.println("Value of int = "+a);
		System.out.println("Value of double = "+b);
		System.out.println("-----Explicit Typecasting-----");
		System.out.println("Value of double = "+c);
		System.out.println("Value of int = "+d);
	}
}