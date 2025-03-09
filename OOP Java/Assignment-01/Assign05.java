/*5. Write a Java program to swap two numbers using a temporary variable and without 
using a temporary variable. 
*/
class Assign05{
	public static void main(String[] args){
		int a = 5;
        int b = 10;
        
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        
        // Using a temporary variable to swap
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After Swapping: a = " + a + ", b = " + b);
		
		System.out.println("Before Swapping: a = " + a + ", b = " + b);
        
        // Swapping without a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After Swapping: a = " + a + ", b = " + b);
	}
}