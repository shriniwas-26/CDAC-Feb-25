/*
7. Implement FileNotFoundException
Write a Java program that tries to open a file that does not exist using FileReader, and handle the FileNotFoundException.
*/
import java.io.*;
class Hw07{
    public static void main(String[] args){

        System.out.println("Start");
        try{
        File f = new File("abc.txt");
        FileReader fr = new FileReader(f);
        }catch(FileNotFoundException e){
            System.out.println("FileNotFoundException occurs here.");
        }
        System.out.println("End");
    }
}