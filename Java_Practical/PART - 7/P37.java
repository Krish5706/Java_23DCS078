class Buffer {
    private int data;
    private boolean isEmpty = true;  

    public synchronized void produce(int value) {
        while (!isEmpty) {  
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;  
        isEmpty = false; 
        System.out.println("Produced: " + data);
        notify(); 
    }

  
    public synchronized void consume() {
        while (isEmpty) {  
            try {
                wait();  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);  
        isEmpty = true;  
        notify();  
    }
}

class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);  // Produce values from 1 to 5
            try {
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();  
            try {
                Thread.sleep(1500);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class P37 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();  
        Producer producer = new Producer(buffer);  
        Consumer consumer = new Consumer(buffer);  

        producer.start();  
        consumer.start();  
    }
}