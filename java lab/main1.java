abstract class shape{
    int a,b;

    abstract void printArea();
}

class Rectangle extends shape{
    Rectangle(int length,int breadth){
        a=length;
        b=breadth;
    }
    public void printArea(){
        System.out.println("Area of Rectangle:"+a*b);
    }
}

class Triangle extends shape{
    Triangle(int base,int heigth){
        a=base;
        b=heigth;
    }
    public void printArea(){
        System.out.println("Area of Triangle:"+0.5*a*b);
    }
}

class Circle extends shape{
    Circle(int radius){
        a=radius;
    }
    public void printArea(){
        System.out.println("Area of Circle:"+3.14*a*a);
    }
}
public class main1{
    public static void main(String args[]){
        Rectangle r=new Rectangle(4,5);
        Triangle t=new Triangle(8,3);
        Circle c=new Circle(4);
        r.printArea();
        t.printArea();
        c.printArea();

    }
}