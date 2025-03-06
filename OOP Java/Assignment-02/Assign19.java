/*
Q19:  Write a Java program that checks whether a character is  uppercase, lowercase, or 
not a letter  using only the ternary operator.
*/
class Assign19{
	public static void main(String[] args){
		check('A');
		check('a');
		check('5');
		check('$');
	}
	static void check(char c){
		String res = (c>=65 && c<=90)? c+" is uppercase.": (c>=97 && c<=122)? c+" is lowercase." : c+" is not a letter.";
		System.out.println(res);
	}
}