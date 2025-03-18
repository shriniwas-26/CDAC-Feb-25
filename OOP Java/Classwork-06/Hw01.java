/*1. Implement NullPointerException
Write a Java program where you initialize a String as null and try to call the .length() method on it. Handle the exception using a try-catch block.
*/
class Hw01{
    public static void main(String[] args){
        String s = null;
        try{
            int a = s.length();
        }catch(NullPointerException e){
            System.out.println("Null Ponter Exception occurs here dont make string as null.");
        }
    }
}