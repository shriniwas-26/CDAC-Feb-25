/*
2. Implement ArithmeticException
Write a Java program that performs division by zero and catches the ArithmeticException.
*/

class Hw02{
    public static void main(String[] args){
        try {
            int a = 100/0;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured : dont divide by 0.");
        }
    }
}