public class IncrementDemo {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("Original value of x: " + x);

        // Post-increment: value used first, then incremented
        System.out.println("Post-increment (x++): " + (x++));
        System.out.println("Value of x after post-increment: " + x);

        // Pre-increment: value incremented first, then used
        System.out.println("Pre-increment (++x): " + (++x));
        System.out.println("Value of x after pre-increment: " + x);
    }
}