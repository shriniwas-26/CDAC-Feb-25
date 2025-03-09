// 1. Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.

class Assign01{
	static int a;
	static float b;
	static char c;
	static double d;
	static boolean e;
	static byte bd;
	static short sd;
	static long ld;
	public static void main(String args[]){
		int f = 10;
		float g = 10.253525f;
		char ch = 'A';
		double h = 15.74845248524;
		boolean i = true;
		short si = 10;
		byte bi = 12;
		long li = 4124234;

		
		System.out.println("Default value of int = "+a);
		System.out.println("Default value of float = "+b);
		System.out.println("Default value of char = "+c);
		System.out.println("Default value of double = "+d);
		System.out.println("Default value of boolean = "+e);
		System.out.println("Default value of short = "+sd);
		System.out.println("Default value of byte = "+bd);
		System.out.println("Default value of long = "+ld);
		
		System.out.println();
		
		System.out.println("Assigned value of int = "+f);
		System.out.println("Assigned value of float = "+g);
		System.out.println("Assigned value of char = "+ch);
		System.out.println("Assigned value of double = "+h);
		System.out.println("Assigned value of boolean = "+i);
		System.out.println("Assigned value of short = "+si);
		System.out.println("Assigned value of byte = "+bi);
		System.out.println("Assigned value of long = "+li);
	}
}