import java.util.*;
class Area {
    float length;
    float breadth;
    Area(float a , float b) { 
        length  = a;
        breadth = b;
    }
    float returnArea() {
        return length *  breadth;
    }
}
public class P15 {
    public static void main(String[] args) {
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        a = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        b = sc.nextFloat();
        Area rectangle = new Area(a,b);
       System.out.println("Area of rectangle : " + rectangle.returnArea()); 
       System.out.println("ID : 23DCS078_KRISH PATEL");
       sc.close();
    }
}
