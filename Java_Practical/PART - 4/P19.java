class Rectangle {
    int length;
    int breadth;

   public Rectangle (int length , int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea() {
        System.out.println("Area of rectangle is : " + length*breadth);
    }
    void printPerimeter() {
        System.out.println("Perimeter of rectangle is : " + 2*(length*breadth));
    }
}
class Square extends Rectangle {
    public Square(int side)  {
        super(side,side);
    }

    @Override
    void printArea() {
        System.out.println("Area of Square is : " + length*length);
    }
    @Override
    void printPerimeter() {
        System.out.println("Perimeter of Rectangle is : " + 4*(length));
    }
}
public class P19 {
public static void main(String[] args) {
    Rectangle[] shapes = new Rectangle[2];
        
    shapes[0] = new Rectangle(5, 10);
    shapes[1] = new Square(4);

    shapes[0].printArea();
    shapes[0].printPerimeter();

    shapes[1].printArea();
    shapes[1].printPerimeter();
    System.out.println("ID :23DCS078_KRISH PATEL");
    
}    
}

// Or
    // for (Rectangle shape : shapes) {
    //     shape.printArea();
    //     shape.printPerimeter();
    //     System.out.println();
    // }