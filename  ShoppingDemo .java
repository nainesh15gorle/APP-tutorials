public class ShoppingDemo {
    public static void main(String[] args) {
        // Create products
        Product laptop = new Product("Laptop", 999.99, 10);
        Product mouse = new Product("Wireless Mouse", 25.50, 50);
        
        // Create user and shopping cart
        User user = new User("Alice Johnson");
        ShoppingCart cart = user.getCart();
        
        System.out.println("=== SHOPPING CART SYSTEM ===");
        System.out.println("Initial stock - Laptop: " + laptop.getStock() + ", Mouse: " + mouse.getStock());
        
        // Add items to cart
        cart.addItem(laptop, 2);
        cart.addItem(mouse, 3);
        
        System.out.println("After adding items - Laptop stock: " + laptop.getStock() + ", Mouse stock: " + mouse.getStock());
        System.out.println("Cart total: $" + cart.calculateTotal());
        
        // Try to add more than available
        System.out.println("\nTrying to add 10 laptops (only " + laptop.getStock() + " available)...");
        cart.addItem(laptop, 10); // Should fail
        System.out.println("Laptop stock remains: " + laptop.getStock());
    }
}