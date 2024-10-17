class MyThread extends Thread {
    MyThread(String name) {
        super(name);  
    }
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}

public class P36 {
    public static void main(String[] args) {
        MyThread first = new MyThread("FIRST");
        MyThread second = new MyThread("SECOND");
        MyThread third = new MyThread("THIRD");
    
        first.setPriority(3);
        first.start();
      
        second.setPriority(Thread.NORM_PRIORITY); 
        second.start();
      
        third.setPriority(7); 
        third.start();
    }
}
