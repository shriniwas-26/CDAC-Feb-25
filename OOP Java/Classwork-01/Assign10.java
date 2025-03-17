// 10. Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.
class Assign10{
	public static void main(String args[]){
		int a = 14;
		int b = 4;
		if(a==b){
			System.out.println(a + " and " + b + " are equal.");
		}
		if(a!=b){
			System.out.println(a + " and " + b + " are not equal.");
		}
		if(a>b){
			System.out.println(a + " is greater than " + b);
		}
		if(b<a){
			System.out.println(b + " is less than " + a);
		}
		if(a>=b){
			System.out.println(a + " is greater than and equals to " + b);
		}
		if(b<=a){
			System.out.println(b + " is less than and equals to " + a);
		}
	}
}