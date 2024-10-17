interface Shape {
    String getColor();
    double getArea();
    String getShape();

    default String getDescription() {
        return "This is a "+ getShape() + " with color " + getColor() + " and area : " + getArea();
    }
}

class Circle implements Shape {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public String getShape() {
        return "Circle";
    }
}

class Rectangle implements Shape {
    double length;
    double width;
    String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return length * width;
    }

    public  String getShape() {
        return "Rectangle";
    }
}

class Sign {
    Shape shape;
    String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void display() {
        System.out.println("Sign Text: " + text);
        System.out.println("Sign Background: " + shape.getDescription());
    }
}

public class P23{
    public static void main(String[] args) {

        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");

        Sign circleSign = new Sign(circle, "This is Circle.");
        Sign rectangleSign = new Sign(rectangle, "This is Rectangle.");

        circleSign.display();
        rectangleSign.display();
        System.out.println("ID :23DCS078_KRISH PATEL");
    }
}
