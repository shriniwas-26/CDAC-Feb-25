/*
Q3. Box Area and Volume 
Write a class Box with three member variables: height, width, and breadth. Include appropriate 
constructors to initialize these variables. Also, implement two methods: 
●  getVolume() to return the volume of the box 
●  getArea() to return the surface area of the box 
Create two instances of the Box class and display their volumes and surface areas.
*/
class Box{
    private double height;
    private double width;
    private double breadth;
    

    public Box(double height, double width, double breadth){
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getVolume(){
        double volume = height*width*breadth;
        return volume;
    }

    public double getArea(){
        double area = 2*(height*width + width*breadth + height*breadth);
        return area;
    }

}
class Assign03{
    public static void main(String[] args){
        Box b1 = new Box(5,4.5,7);
        Box b2 = new Box(4,3.5,2);
        System.out.println("Volume of box 1 : "+b1.getVolume());
        System.out.println("Surface area of box 1 : "+b1.getArea());
        System.out.println("Volume of box 2 : "+b2.getVolume());
        System.out.println("Surface area of box 2 : "+b2.getArea());
    }
}