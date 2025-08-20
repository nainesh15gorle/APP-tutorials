public class EcommerceProcedural {
    public static void main(String[] args) {
        double[] orderPrices = {99.99, 25.50, 199.99, 49.95};
        double total = 0.0;

        for (double price : orderPrices) {
            total += price;
        }

        System.out.printf("Total order value (Procedural): $%.2f%n", total);
    }
}