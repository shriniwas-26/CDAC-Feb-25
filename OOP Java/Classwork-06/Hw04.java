/*
4. Implement NumberFormatException
Write a Java program that tries to convert a non-numeric string to an integer using Integer.parseInt() and catches the NumberFormatException.
*/

class Hw04{
    public static void main(String[] args){
        String a = "10";
        String b = "j";

        try{
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException occurs here.");
        }
    }
}