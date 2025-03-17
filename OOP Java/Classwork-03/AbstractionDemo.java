abstract class Vehicle{
	abstract void method();
	void display(){
		System.out.println("Default Display method of abstract class Vehicle");
	}
}
class Bike extends Vehicle{
	static double avg;
	void method(){
		System.out.println("This is overriden method from abstract class.");
	}
	static void avg(double av){
		avg = av;
		
	}
	void show(){
		System.out.println("Avg: "+this.avg);
	}
}
class AbstractionDemo{
	public static void main(String[] args){
		Bike b = new Bike();
		b.display();
		b.method();
		b.avg(70.678);
		b.show();
	}
}