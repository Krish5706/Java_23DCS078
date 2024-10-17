import java.util.*;
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Expenses[] = new float[31];
        float total_expenses = 0;
        for(int i = 1 ; i <= 30 ; i++) {
            System.out.print("Enter your day " + i + " expenses : ");
            Expenses[i] = sc.nextFloat();
            total_expenses += Expenses[i];
        }
        System.out.println("Total Expenses is : " + total_expenses);
        System.out.println("ID : 23DCS078_KRISH PATEL");
        sc.close();
    }
    
}
