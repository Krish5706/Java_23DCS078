class parent {
    void display()  {
        System.out.println("This is parent class");
    }
}
class child extends parent {
    void childdisplay() {
        System.out.println("This is child class");
    }
}
public class P17 {
    public static void main(String[] args) {
        parent p =  new parent();
        p.display();

        child c = new child();
        c.childdisplay();   
        System.out.println("ID :23DCS078_KRISH PATEL");
    }   
}