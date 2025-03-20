/*
Q2. Student Marks and Grade Calculation with Exception Handling 
Design a Java program to calculate the total marks, average, and grade of a student, with 
proper exception handling for invalid inputs. Implement a class named Student with the 
following specifications: 
Class: Student 
Instance Variables 
●  name (String): Name of the student 
●  rollNo (int): Roll number of the student 
●  marks (double array of size 5): Marks obtained in 5 subjects 
●  average (double): Average marks 
●  grade (char): Grade based on average 
Constructor 
●  A parameterized constructor to initialize the name, rollNo, and marks. 
●  Throw an IllegalArgumentException if any mark is negative or greater than 100. 
Methods 
●  void calculateAverage(): Computes the average of marks. 
●  void calculateGrade(): Assigns grade based on the average as per the following 
criteria: 
○  A: average ≥ 90 
○  B: 80 ≤ average < 90 
○  C: 70 ≤ average < 80 
○  D: 60 ≤ average < 70 
○  F: average < 60 
●  void displayStudentInfo(): Displays the student’s name, roll number, marks, average, 
and grade. 
Main Program 
In the main() method: 
1.  Prompt the user to input student details and marks for 5 subjects. 
2.  Use a try-catch block to handle the following: 
○  InputMismatchException for non-numeric input 
○  IllegalArgumentException for invalid mark entries (e.g., < 0 or > 100) 
3.  Create a Student object, calculate average and grade, and display the full information.
*/
import java.util.*;
class Student{
    private String name;
    private int rollNo;
    private double marks[] = new double[5];
    private double average;
    private char grade;

    Student(String name, int rollNo, double m1, double m2, double m3, double m4, double m5) throws IllegalArgumentException{
        this.name = name;
        this.rollNo = rollNo;
        if((m1<0 || m1>100) || (m2<0 || m2>100) || (m3<0 || m3>100) || (m4<0 || m4>100) || (m5<0 || m5>100)){
            throw new IllegalArgumentException();
        }
        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;
        this.marks[3] = m4;
        this.marks[4] = m5;
    }

    public void calculateAverage(){
        average = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
    }

    public void calculateGrade(){
        if(average>=90){
            grade = 'A';
        }else if(average>=80){
            grade = 'B';
        }else if(average>=70){
            grade = 'C';
        }else if(average>=60){
            grade = 'D';
        }else{
            grade = 'F';
        }
    }

    public void displayStudentInfo(){
        System.out.println("Student's name: "+name);
        System.out.println("Student's rollNo: "+rollNo);
        System.out.println("mark in sub 1: "+marks[0]);
        System.out.println("mark in sub 2: "+marks[1]);
        System.out.println("mark in sub 3: "+marks[2]);
        System.out.println("mark in sub 4: "+marks[3]);
        System.out.println("mark in sub 5: "+marks[4]);
        System.out.println("Average: "+average);
        System.out.println("grade: "+grade);
    }
}
class Assign02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double marks[] = new double[5];
        try{
            System.out.print("Enter Student name: ");
            String name = sc.nextLine();
            System.out.print("Enter Student rollNo: ");
            int rollNo = sc.nextInt();
            System.out.print("Sub1 marks: ");
            marks[0] = sc.nextDouble();
            System.out.print("Sub2 marks: ");
            marks[1] = sc.nextDouble();
            System.out.print("Sub3 marks: ");
            marks[2] = sc.nextDouble();
            System.out.print("Sub4 marks: ");
            marks[3] = sc.nextDouble();
            System.out.print("Sub5 marks: ");
            marks[4] = sc.nextDouble();
            
            Student s = new Student(name,rollNo,marks[0],marks[1],marks[2],marks[3],marks[4]);
            s.calculateAverage();
            s.calculateGrade();
            s.displayStudentInfo();
        }catch(InputMismatchException e){
            System.out.println(e);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        

    }
}