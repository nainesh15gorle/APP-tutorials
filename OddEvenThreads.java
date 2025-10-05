class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
    }
}

public class OddEvenThreads {
    public static void main(String[] args) {
        new OddThread().start();
        new EvenThread().start();
    }
}