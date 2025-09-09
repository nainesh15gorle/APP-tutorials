class HelloThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Welcome");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class HelloWelcome {
    public static void main(String[] args) {
        new HelloThread().start();
        new WelcomeThread().start();
    }
}