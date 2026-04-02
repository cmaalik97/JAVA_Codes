package ch9_ObjectsAndClasses;

public class Circle {
    double radius=1;
    Circle(){}
        Circle(double newRadius){this.radius=newRadius;}
    double getArea(){return radius*radius*Math.PI; }
    void setRadius(double r){radius=r;}
    public static void main(String[] args) {
        Circle circle1=new Circle();
        System.out.println("The Area of the Circle of radius: "+circle1.radius+" is: "+
                +circle1.getArea());
        circle1.setRadius(4);
        System.out.println("The Area of the circle of radius "+circle1.radius+ "is: "+
                +circle1.getArea());
        Circle circle2=new Circle(5);
        System.out.println("the Area of: "+circle2.radius+ "is : "+circle2.getArea());
    }



}
