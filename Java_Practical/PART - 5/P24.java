// import java.util.*; 
// public class P24 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value of X : ");
//         int x = sc.nextInt();
//         System.out.print("Enter value of Y : ");
//         int y = sc.nextInt();

//         try {
//             System.out.println(x/y);  // ArithmeticException
//         }
//         catch (NumberFormatException e) {
//             System.out.println(e);
//         } 
  
//         catch (ArithmeticException e) {
//             System.out.println(e);
//         } 
        // catch(Exception e) {
        //     System.out.println(e);
        //     System.out.println("To String Method : " + e.toString());
        //     System.out.println("Get Message : " + e.getMessage());
        // }
//         System.out.println("ID :23DCS078_KRISH PATEL");
//         sc.close();
//     }
// }

import java.util.Scanner;
public class P24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer (x): ");
            int x = Integer.parseInt(sc.nextLine()); // Parse integer input

            System.out.print("Enter the second integer (y): ");
            int y = Integer.parseInt(sc.nextLine()); // Parse integer input

            int result = x / y;
            System.out.println("Result of " + x + " / " + y + " = " + result);
        } 
       
        catch (NumberFormatException e) {
            System.out.println(e);
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        } 
        System.out.println("ID :23DCS078_KRISH PATEL");
        sc.close();
    }
}

// catch (Exception e) {
//     System.out.println("An unexpected error occurred: " + e.getMessage());
// }