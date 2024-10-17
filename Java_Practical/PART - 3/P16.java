import java.text.DecimalFormat;
import java.util.Scanner;
class Complex {
    float real;
    float imag;
    static final DecimalFormat df = new DecimalFormat("+#;-#");
    Scanner sc = new Scanner(System.in);
    void getData() {
        System.out.print("Enter real part: ");
        real = sc.nextFloat();
        System.out.print("Enter imaginary part: ");
        imag = sc.nextFloat();
    }

    Complex add(Complex b) {
        Complex temp = new Complex();
        temp.real = this.real + b.real;
        temp.imag = this.imag + b.imag;
        return temp;
    }

    Complex subtract(Complex b) {
        Complex temp = new Complex();
        temp.real = this.real - b.real;
        temp.imag = this.imag - b.imag;
        return temp;
    }

    Complex multiply(Complex b) {
        Complex temp = new Complex();
        temp.real = (this.real * b.real) - (this.imag * b.imag);
        temp.imag = (this.real * b.imag) + (this.imag * b.real);
        return temp;
    }

    Complex divide(Complex b) {
        Complex temp = new Complex();
        float denominator = (b.real * b.real) + (b.imag * b.imag);
        temp.real = ((this.real * b.real) + (this.imag * b.imag)) / denominator;
        temp.imag = ((this.imag * b.real) - (this.real * b.imag)) / denominator;
        return temp;
    }

    Complex negate() {
        Complex temp = new Complex();
        temp.real = -this.real;
        temp.imag = -this.imag;
        return temp;
    }

    void setData() {
        System.out.println(real + " " + df.format(imag) + "i");
    }
}
public class P16 {
    public static void main(String[] args) {
        Complex obj1 = new Complex();
        Complex obj2 = new Complex();
        Complex obj3 = new Complex();
        Scanner sc = new Scanner(System.in);

        obj1.getData();
        obj2.getData();

        System.out.println("Choose operation ");
        System.out.println("(+) addition ");
        System.out.println("(-) subtraction ");
        System.out.println("(*) multiplication ");
        System.out.println("(/) division ");
        System.out.println("(!) negation ");
        System.out.print("Enter your choice: ");
        char choice = sc.next().charAt(0);

        switch (choice) {
            case '+':
                obj3 = obj1.add(obj2);
                obj3.setData();
                break;
            case '-':
                obj3 = obj1.subtract(obj2);
                obj3.setData();
                break;
            case '*':
                obj3 = obj1.multiply(obj2);
                obj3.setData();
                break;
            case '/':
                obj3 = obj1.divide(obj2);
                obj3.setData();
                break;
            case '!':
                obj3 = obj1.negate();
                obj3.setData();
                obj3 = obj2.negate();
                obj3.setData();
                break;
            default:
                System.out.println("Enter a valid operator.");
        }
        System.out.println("ID : 23DCS078_KRISH PATEL");
        sc.close();
    }
}