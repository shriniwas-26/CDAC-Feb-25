// 3. Write a program to convert a double value to int using typecasting and explain the data loss.
class Assign3{
	public static void main(String args[]){
		double d = 18.4242424;
		int i = (int) d;
		
		System.out.println("Value of double: "+d);
		System.out.println("Converted Value of double to int: "+i);
	}
}