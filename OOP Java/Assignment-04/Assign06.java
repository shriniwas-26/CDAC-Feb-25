/*
Q6. Electricity Bill Calculation – Java Program 
Design a Java program to calculate the electricity bill for a customer based on the number of units 
consumed. Implement a class named ElectricityBill with the following specifications: 
Class: ElectricityBill 
Instance Variables 
●  customerName (String): Name of the customer 
●  unitsConsumed (double): Number of electricity units consumed 
●  billAmount (double): The calculated bill amount 
Constructor 
●  A parameterized constructor to initialize the customerName and unitsConsumed fields. 
Method 
●  void calculateBillAmount(): This method calculates the electricity bill amount based on the 
following tariff rules: 
○  First 100 units: Rs. 5 per unit 
○  Next 200 units (i.e., 101 to 300): Rs. 7 per unit 
○  Remaining units (above 300): Rs. 10 per unit 
Main Program 
In the main() method:

1.  Create an object of the ElectricityBill class. 
2.  Set the customerName and unitsConsumed values (can be taken from user input or 
hardcoded). 
3.  Call the calculateBillAmount() method to compute the bill. 
4.  Display the customer's name, units consumed, and final bill amount.
*/

class ElectricityBill{
    String customerName;
    double unitsConsumed;
    double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed){
        this.customerName = customerName;
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
class Assign06{
    public static void main(String[] args){
        ElectricityBill eb = new ElectricityBill("Shriniwas", 350);
        eb.calculateBillAmount();
        System.out.println("Customer's name : "+eb.customerName);
        System.out.println("Units consumed : "+eb.unitsConsumed);
        System.out.println("Final bill amount : "+eb.billAmount);
    }
}