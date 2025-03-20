/*
Q2. Student Marks and Average 
Create a class Student with the following members: 
●  Name of the student 
●  Marks in three subjects 
●  A method to assign initial values 
●  A method to compute the total and average marks 
●  A method to display the student’s name and total marks 
Write a main() method to demonstrate the functionality of the class.
*/
class Student{
    private String sName;
    private int sub1;
    private int sub2;
    private int sub3;
    private int total;
    private double avg;

    public void assign(String sName, int sub1, int sub2, int sub3){
        this.sName = sName;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public void compute(){
        total = sub1 + sub2 + sub3;
        avg = (double) total / 3;
    }

    public void display(){
        System.out.println("Student Name : "+sName+", Total marks : "+total+", Average marks : "+avg);
    }

}
class Assign02{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.assign("Shriniwas",70,75,85);
        s1.compute();
        Student s2 = new Student();
        s2.assign("Rahul",35,25,26);
        s2.compute();
        s1.display();
        s2.display();
        
    }
}