class Date{
    int day;
    int month;
    int year;
    Date(int a , int b , int c) {
        month = a;
        day =  b;
        year = c;
    }
    public void displayDate() {
        System.out.println("Date : " +  month + " /" + day + " /" + year);
    }
}
public class P14 {
    public static void main(String[] args) {
        Date d1 = new Date(1, 2, 2023);
        d1.displayDate();
        System.out.println("ID : 23DCS078_KRISH PATEL");
    }
}