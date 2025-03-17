class Parent {
    String pName;
    Parent(){
        System.out.println("DEfault : Parent");
    }
    Parent(String pName){
        this();
        this.pName = pName;
        System.out.println("Parameterized : Parent : "+this.pName);
    }
}
class Child extends Parent {
    String cName;
    Child(){
        super("shriniwas");
        System.out.println("DEfault : Child");
    }
    Child(String cName){
        this();
        this.cName = cName;
        System.out.println("Parameterized : Child : "+this.cName);
    }
}
class Hw4{
    public static void main(String[] args){
        Child c = new Child();
        

    }
}