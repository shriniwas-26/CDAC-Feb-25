// Write a Java program to check whether a number is prime or not.

import java.util.*;

class Assign16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean flag = false;

        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("The number "+ n + " is not Prime");
        }else{
            System.out.println("The number "+ n + " is Prime");
        }
    }
}