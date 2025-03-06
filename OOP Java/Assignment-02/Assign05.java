/*Q5:  Write a Java program to  swap two numbers  using the  +=  and  -=  operators only
*/

public class Assign05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        
        a += b;
		b -= a;
		b = -b;
		a -= b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
