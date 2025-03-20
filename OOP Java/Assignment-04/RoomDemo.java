/*
Q1. Room Volume Calculation 
Design a class named Room with three data members: height, width, and breadth. Include a method 
volume() to compute and return the volume of the room. Create a separate class RoomDemo that 
creates instances of the Room class and displays the volume for each instance. 
*/
class Room{
    private double height;
    private double width;
    private double breadth;

    public Room(double height, double width, double breadth){
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double volume(){
        return height*width*breadth;
    }

}
class RoomDemo{
    public static void main(String[] args){
        Room r1 = new Room(3,6,9);
        Room r2 = new Room(5,4.5,3);
        Room r3 = new Room(9,3.5,7);
        System.out.println("Volume of room 1 : "+r1.volume());
        System.out.println("Volume of room 2 : "+r2.volume());
        System.out.println("Volume of room 3 : "+r3.volume());
    }
}