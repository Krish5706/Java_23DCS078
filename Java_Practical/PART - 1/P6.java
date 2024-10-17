import java.util.*;
public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        double a = 0;
        double b = 1;
        double  sum = a + b;
// 0 1 1 2 3 5 
        System.out.print(String.format("%.0f" + " , " + "%.0f" + " , ", a , b ));

        for(int i = 0 ; i < n - 2 ; i++) {
            double c = a + b;
            a = b;
            b = c;
            System.out.print(String.format("%.0f" + " , ", c));
            sum += c;
        }
        System.out.println("\nSum is : " + sum);
        System.out.println("ID : 23DCS078_KRISH PATEL");
        sc.close();
    }
    
}
