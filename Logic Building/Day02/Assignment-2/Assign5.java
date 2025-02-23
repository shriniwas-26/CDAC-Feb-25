/*
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in.
*/


import java.util.*;
class Assign5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score of subject A: ");
        int a = sc.nextInt();
        System.out.print("Enter score of subject B: ");
        int b = sc.nextInt();
        System.out.print("Enter score of subject C: ");
        int c = sc.nextInt();
	int fail = 0;
	

	if(a<=40){
		fail++;
	}
	if(b<=40){
		fail++;
	}
	if(c<=40){
		fail++;
	}


	
	switch(fail){
		case 0:
			System.out.println("The student has passed.");
			break;
		default:
			System.out.println("The student failed in "+ fail +" subjects.");


	}
        
    }
}