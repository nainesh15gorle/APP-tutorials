 class Table5 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try { Thread.sleep(400); } catch (InterruptedException e) {}
        }
    }
}

class Table10 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("10 x " + i + " = " + (10 * i));
            try { Thread.sleep(400); } catch (InterruptedException e) {}
        }
    }
}

public class MultiplicationTables {
    public static void main(String[] args) {
        new Table5().start();
        new Table10().start();
    }
}