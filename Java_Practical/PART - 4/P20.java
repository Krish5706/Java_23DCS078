class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}
public class P20 {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();        
        square.printRectangle(); 
        System.out.println("ID :23DCS078_KRISH PATEL");
        
    }
}

// Circle circle = new Circle();
// circle.printShape();
// circle.printCircle();

// Rectangle rectangle = new Rectangle();
// rectangle.printShape();
// rectangle.printRectangle();