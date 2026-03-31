class Printer {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Printer p = new Printer();

        Thread t1 = new Thread(() -> p.printNumbers(), "Thread A");
        Thread t2 = new Thread(() -> p.printNumbers(), "Thread B");

        t1.start();
        t2.start();
    }
}
