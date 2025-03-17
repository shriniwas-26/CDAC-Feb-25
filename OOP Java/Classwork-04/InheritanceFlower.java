class Flower{
    String name;
    String color;
    boolean hasFragrance;
}
class Rose extends Flower{
    boolean hasThorns;
    Rose(String color, boolean hasFragrance, boolean hasThorns){
        super.name = "Rose";
        super.color = color;
        super.hasFragrance = hasFragrance;
        this.hasThorns = hasThorns;
    }
    void display(){
        System.out.println("Flower Name: "+super.name);
        System.out.println("Color: "+super.color);
        System.out.println("Has Fragrance: "+(super.hasFragrance? "Yes" : "No"));
        System.out.println("Has Thorns: "+(this.hasThorns? "Yes" : "No"));
    }
}
class Lily extends Flower{
    boolean isWaterPlant;
    Lily(String color, boolean hasFragrance, boolean isWaterPlant){
        super.name = "Lily";
        super.color = color;
        super.hasFragrance = hasFragrance;
        this.isWaterPlant = isWaterPlant;
    }
    void display(){
        System.out.println("Flower Name: "+super.name);
        System.out.println("Color: "+super.color);
        System.out.println("Has Fragrance: "+(super.hasFragrance? "Yes" : "No"));
        System.out.println("Grows in Water: "+(this.isWaterPlant? "Yes" : "No"));
    }
}
class InheritanceFlower{
    public static void main(String[] args){
        Rose r = new Rose("Red",true,true);
        Lily l = new Lily("White",true,true);

        System.out.println("---- Rose Details ----");
        r.display();
        System.out.println("---- Lily Details ----");
        l.display();
    }
}