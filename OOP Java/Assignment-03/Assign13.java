/*13.  Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class 
students in a single Dimensional Array. Find and display the following: 
○  Number of students securing 75% and above in aggregate. 
○  Number of students securing 40% and below in aggregate.
*/
import java.util.Scanner;
class Student{
	int physics;
	int chemistry;
	int maths;
	
	Student(int physics, int chemistry, int maths){
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}
	
	double aggregate(){
		return (double)(physics + chemistry + maths)/3;
	}
}

class Assign13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[20];
		
		for(int i=0; i<s.length; i++){
			System.out.print("Enter student "+(i+1)+" mark in physics: ");
			int physics = sc.nextInt();
			System.out.print("Enter student "+(i+1)+" mark in chemistry: ");
			int chemistry = sc.nextInt();
			System.out.print("Enter student "+(i+1)+" mark in maths: ");
			int maths = sc.nextInt();
			
			s[i] = new Student(physics, chemistry, maths);
		}
		
		for(int i=0; i<s.length; i++){
			System.out.println("Stuent "+ (i+1) + " aggregate: "+ s[i].aggregate());
		}
	}
}