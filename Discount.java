class Customer {
    void getDiscount() {
        System.out.println("Customer gets no discount");
    }
}
class RegularCustomer extends Customer {
    @Override
    void getDiscount() {
        System.out.println("Regular Customer gets 5% discount");
    }
}
class PremiumCustomer extends Customer {
    @Override
    void getDiscount() {
        System.out.println("Premium Customer gets 10% discount");
    }
}
public class Discount {
    public static void main(String[] args) {
        Customer regular = new RegularCustomer();   
        Customer premium = new PremiumCustomer();   

        regular.getDiscount();   
        premium.getDiscount();   
    }
}