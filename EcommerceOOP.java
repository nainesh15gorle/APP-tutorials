import java.util.ArrayList;
import java.util.List;

class Order {
    private String orderId;
    private double price;

    public Order(String orderId, double price) {
        this.orderId = orderId;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class OrderProcessor {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Order order : orders) {
            total += order.getPrice();
        }
        return total;
    }
}

public class EcommerceOOP {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        processor.addOrder(new Order("ORD001", 99.99));
        processor.addOrder(new Order("ORD002", 25.50));
        processor.addOrder(new Order("ORD003", 199.99));
        processor.addOrder(new Order("ORD004", 49.95));

        System.out.printf("Total order value (OOP): $%.2f%n", processor.calculateTotal());
    }
}