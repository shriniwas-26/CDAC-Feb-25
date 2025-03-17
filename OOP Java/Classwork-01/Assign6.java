// 6. Write a program to display character and string literals along with their ASCII values.
class Assign6{
	public static void main(String args[]){
		char c = 'a';
		String s = "Hello";
		System.out.println("Ascii value of "+c+" is "+(int)c);
		
		for(int i=0; i<s.length(); i++){
			System.out.print(s.charAt(i)+" is "+(int)s.charAt(i)+", ");
		}
	}
}