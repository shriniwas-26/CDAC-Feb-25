class Employee{
	float salary = 20000;

}

class Programmer extends Employee{
	int bonus = 1000;
	
}
class SingleInheritance{
	public static void main(String args[]){
		
		Employee e = new Programmer();
		System.out.println("Sal = "+e.salary);
		
		
		Programmer p= new Programmer();
		System.out.println("Sal = "+p.salary);
		System.out.println("Bonus = "+p.bonus);
	}	
}