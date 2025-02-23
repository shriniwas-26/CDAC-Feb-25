// Write a Java program to print the first N natural numbers, where N is provided by the user.

import java.util.*;

class Assign17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
    }
}