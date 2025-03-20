/*
Q1. Electricity Bill Calculation with Exception Handling 
Design a Java program to calculate the electricity bill for a customer, including exception 
handling for invalid input values. Implement a class named ElectricityBill with the following 
specifications: 
Class: ElectricityBill 
Instance Variables 
●  customerName (String): Name of the customer 
●  unitsConsumed (double): Number of electricity units consumed 
●  billAmount (double): The calculated bill amount 
Constructor 
●  A parameterized constructor to initialize the customerName and unitsConsumed 
fields. 
●  Throw an IllegalArgumentException if unitsConsumed is negative. 
Method 
●  void calculateBillAmount(): This method calculates the electricity bill based on the 
following rules: 
○  First 100 units: Rs. 5 per unit 
○  Next 200 units (101–300): Rs. 7 per unit 
○  Above 300 units: Rs. 10 per unit 
Main Program 
In the main() method: 
1.  Prompt the user to enter the customer’s name and units consumed. 
2.  Use try-catch blocks to handle the following scenarios: 
○  Catch InputMismatchException if the user enters non-numeric data for units. 
○  Catch IllegalArgumentException if a negative value is entered for units. 
3.  If the input is valid, create an object of the ElectricityBill class, compute the bill using 
calculateBillAmount(), and print the customer’s name, units consumed, and the total 
bill amount. 
*/
import java.util.*;
class ElectricityBill{
    String customerName;
    double unitsConsumed;
    double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed) throws IllegalArgumentException {
        this.customerName = customerName;
        if(unitsConsumed<0){
                throw new IllegalArgumentException();
        }
        this.unitsConsumed = unitsConsumed;
    }

    public void calculateBillAmount(){
        if(unitsConsumed<=100){
            billAmount = 5*unitsConsumed;
        }else if(unitsConsumed<=300){
            billAmount = (100*5) + ((unitsConsumed - 100)*7);
        }else {
            billAmount = (100*5) + (200*7) + ((unitsConsumed-300)*10);
        }
    }
}
class Assign01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Customer name: ");
            String cName = sc.nextLine();
            System.out.println("Enter units consumed: ");
            double units = sc.nextDouble();
            
            ElectricityBill eb = new ElectricityBill(cName, units);
            eb.calculateBillAmount();
            System.out.println("Customer's name : "+eb.customerName);
            System.out.println("Units consumed : "+eb.unitsConsumed);
            System.out.println("Final bill amount : "+eb.billAmount);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }catch(InputMismatchException e){
            System.out.println(e);
        }
        
    }
}