
public class P7 {
    public static String front_times(String str , int n) {
        String s4 = "";
        String s5 = "";
        int length = str.length();
        if(str.length() > 3) {
           s4 = str.substring(0, 3);
        }
        else {
            s4 = str.substring(0,length);    
        }
        for(int i = 0 ; i < n ; i++) {
            s5 += s4;   
        }
        return s5;
    }
    public static void main(String[] args) {
        String s1 = "Chocolate";
        String s2 = "Chocolate";
        String s3 = "Abc";
        
        front_times(s1, 2);
        System.out.println(  front_times(s1, 2));
        front_times(s2, 3);
        System.out.println(  front_times(s2, 3));
        front_times(s3, 3);
        System.out.println(  front_times(s3, 3));
        System.out.println("ID : 23DCS078_KRISH PATEL");
    }
}
