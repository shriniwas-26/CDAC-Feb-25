/* 4. Create a Java program that converts a given integer to a double and vice versa using 
wrapper classes.  
*/
class Assign04{
	public static void main(String args[]){
		Integer intValue = 10;
        Double doubleValue = intValue.doubleValue();
        System.out.println("Integer to Double: " + doubleValue);

        // Convert Double to Integer
        Double doubleValue2 = 20.5;
        Integer intValue2 = doubleValue2.intValue();
        System.out.println("Double to Integer: " + intValue2);
	}
}