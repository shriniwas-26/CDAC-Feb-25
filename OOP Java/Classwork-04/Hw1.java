class Parent {
    String pName;
    Parent(){
        System.out.println("DEfault : Parent");
    }
    Parent(String pName){
        this.pName = pName;
        System.out.println("Parameterized : Parent : "+this.pName);
    }
}
class Child extends Parent {
    String cName;
    Child(){
        super();
        System.out.println("DEfault : Child");
    }
    Child(String cName){
        super();
        this.cName = cName;
        System.out.println("Parameterized : Child : "+this.cName);
    }
}
class Hw1{
    public static void main(String[] args){
        Child c = new Child();
        Child c1 = new Child("Shriniwas");

    }
}