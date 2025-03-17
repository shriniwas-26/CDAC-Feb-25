import java.util.Scanner;
abstract class Bank{
    abstract void withdraw(double amt);
    abstract void deposit(double amt);
    abstract double getBal();
}
class Customer extends Bank{
    double bal;
    String name;

    Customer(double bal, String name){
        this.bal = bal;
        this.name = name;
    }

    void deposit(double amt){
        bal+=amt;
    }
    void withdraw(double amt){
        if(bal-amt>=0){
            bal-=amt;
        }else{
            System.out.println("insufficient balance..");
        }
    }
    double getBal(){
        return bal;
    }
}
class BankDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter a customer balance: ");
        double balance = sc.nextDouble();
        Customer c = new Customer(balance, name);
        System.out.print("Enter a amount to deposit: ");
        double amt = sc.nextDouble();
        c.deposit(amt);
        System.out.print("Enter a amount to withdraw: ");
        double withdrw = sc.nextDouble();
        c.withdraw(withdrw);
        double bal = c.getBal();
        System.out.println("Remaining balance of "+c.name+ " is "+bal);
    }
}