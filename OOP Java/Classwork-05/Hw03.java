class BMW{
    void showDetails(){
        System.out.println("This is a BMW vehicle.");
    }
    void maxSpeed(){
        System.out.println("Speed varies by model.");
    }
}

class BMWSeries3 extends BMW{
    void showDetails(){
        System.out.println("This is a BMWSeries3 vehicle.");
    }
    void maxSpeed(){
        System.out.println("Speed 240 km/h.");
    }
}
class BMWSeries5 extends BMW{
    void showDetails(){
        System.out.println("This is a BMWSeries5 vehicle.");
    }
    void maxSpeed(){
        System.out.println("Speed 260 km/h.");
    }
}
class BMWSeries7 extends BMW{
    void showDetails(){
        System.out.println("This is a BMWSeries7 vehicle.");
    }
    void maxSpeed(){
        System.out.println("Speed 300 km/h.");
    }
}
class Hw03{
    public static void main(String[] args){
        BMW bmw[] = new BMW[3];
        bmw[0] = new BMWSeries3();
        bmw[1] = new BMWSeries5();
        bmw[2] = new BMWSeries7();

        for(BMW b : bmw){
            b.showDetails();
            b.maxSpeed();
        }
    }
}