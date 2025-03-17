class GrandParent{
    String gpName;
    GrandParent(){
        System.out.println("DEfault : GrandParent");
    }
    GrandParent(String gpName){
        this();
        this.gpName = gpName;
        System.out.println("Parameterized : GrandParent : "+this.gpName);
    }
}
class Parent extends GrandParent {
    String pName;
    Parent(){
        super("shriniwas");
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
class ConstrChaining{
    public static void main(String[] args){
        Child c = new Child("Shriniwas");
        

    }
}