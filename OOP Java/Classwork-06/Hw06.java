/*
6. Implement IOException
Write a Java program that attempts to read from a file that does not exist and catches IOException.
*/
import java.io.*;
class Hw06{
    public static void main(String[] args) throws IOException{
        System.out.println("Start");
        int a = System.in.read();
        System.out.println("End");
    }
}