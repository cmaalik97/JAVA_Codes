package ch9_ObjectsAndClasses;

public class Rectangle {
    double width=1.0;
    double height=2.0;
    Rectangle(){};
       Rectangle(double width, double height){
           this.width=width;
           this.height=height;
       };

    double getArea(){return width*height;}
    double getPerimeter(){return 2*(width+height);}

}
