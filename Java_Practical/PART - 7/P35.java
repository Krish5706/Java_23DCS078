public class P35 extends Thread {
    private int value = 0;

    public void run() {
        while (true) {
            value++;
            System.out.println("Value: " + value);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        P35 incrementer = new P35();
        incrementer.start();
    }
}
