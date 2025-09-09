class Shape {
    void area() {
        System.out.println("Area of shape is undefined");
    }
}
class Circle extends Shape {
    double radius = 5;

    @Override
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
class Rectangle extends Shape {
    double length = 4;
    double width = 6;

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}
public class Shapes{
    public static void main(String[] args) {
        Shape s1 = new Circle();     
        Shape s2 = new Rectangle(); 
        s1.area();  
		s2.area();
    }
}