import java.util.*;
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of distance in meter : ");
        float meter = sc.nextFloat();
        System.out.print("Enter value of hour : ");
        float hour = sc.nextFloat();
        System.out.print("Enter value of minutes : ");
        float minutes = sc.nextFloat();
        System.out.print("Enter value of second : ");
        float second = sc.nextFloat();

        float total_minutes = (hour * 60) + minutes + (second / 60);
        float kilometers = meter / 1000;
        float miles = meter / 1609;
        float total_second = total_minutes * 60;
        float total_hour = total_minutes / 60;
        System.out.println("Speed in meters per second is : " + meter / total_second + " m/s");
        System.out.println("Speed in kilometers per hour is : " + kilometers / total_hour + " km/h");
        System.out.println("Speed in miles per hour is : " + miles / total_hour + " miles/h");
        System.out.println("ID : 23DCS078_KRISH PATEL");
        sc.close();
    }
    
}
