import java.util.ArrayList;
class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
class CartItem {
    Product product;
    int quantity;

    CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    double getItemTotal() {
        return product.price * quantity;
    }
}
class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(Product p, int qty) {
        if (qty <= p.stock) {
            items.add(new CartItem(p, qty));
            p.stock -= qty;  // reduce stock
            System.out.println(qty + " " + p.name + "(s) added to cart.");
        } else {
            System.out.println("Not enough stock for " + p.name);
        }
    }

    void removeItem(Product p) {
        items.removeIf(item -> item.product == p);
        System.out.println(p.name + " removed from cart.");
    }

    double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getItemTotal();
        }
        if (total > 500) {
            total *= 0.9;
            System.out.println("10% discount applied!");
        }
        return total;
    }
}
class User {
    String name;
    ShoppingCart cart;

    User(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
    }
}

public class OnlineShoppingDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 40000, 5);
        Product p2 = new Product("Headphones", 1500, 2);
       User u1 = new User("Nainesh");
        u1.cart.addItem(p1, 1);  
        u1.cart.addItem(p2, 2);  
        double total = u1.cart.calculateTotal();
        System.out.println(u1.name + "'s total bill: " + total);
    }
}