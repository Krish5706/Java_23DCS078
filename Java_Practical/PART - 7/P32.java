class Thread1 extends Thread{  // by extending Thread class
    public void run(){
        System.out.println("Hello world");
    }
}
class Thread2 implements Runnable{ //by using Runnable interface.
    public void run(){
        System.out.println("Hello world 1");
    }
}
public class P32 {
    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.start();
        
        Thread2 obj2 = new Thread2();
        Thread t1 = new Thread(obj2);
        t1.start();
    }
}