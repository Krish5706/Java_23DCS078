public class P9 {
 
    public static void main(String[] args) {

        System.out.println(double_char("The"));
        System.out.println(double_char("AABB"));
        System.out.println(double_char("Hi-There"));
        System.out.println("ID : 23DCS078_KRISH PATEL");

    }
    public static String double_char(String str){
        String result="";
        char ch=0;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
        result+=ch;
        result+=ch;
    }
        return result;
    }
}
