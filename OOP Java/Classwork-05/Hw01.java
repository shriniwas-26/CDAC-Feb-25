abstract class Shape{
    protected String shapeName;
    
    String getShapeName(){
        return this.shapeName;
    }
    abstract void calculateArea();
}
class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void calculateArea(){
        double area = Math.PI * (radius*radius);
        System.out.println("Area of Circle: "+area);
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    void calculateArea(){
        double area = length*width;
        System.out.println("Area of Rectangle: "+area);
    }
}
class Hw01{
    public static void main(String[] args){
        Shape s1 = new Circle(5.0);
        Shape s2 = new Rectangle(4.0,6.0);
        s1.calculateArea();
        s2.calculateArea();
    }
}