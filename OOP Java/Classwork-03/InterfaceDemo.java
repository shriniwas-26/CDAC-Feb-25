interface Bird{
	void sound();
	void fly();
}
class Parrot{
	void sound(){
		System.out.println("Parrot speaking like human.");
	}
	void fly(){
		System.out.println("Parrot is flying.");
	}
}
class InterfaceDemo{
	public static void main(String[] args){
		Parrot b = new Parrot();
		b.sound();
		b.fly();
	}
}