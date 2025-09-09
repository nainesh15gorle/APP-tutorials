class Vehicle {
    void speed() {
        System.out.println("Vehicle is running...");
    }
}
class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car runs at 100 km/h");
    }
}
class Bike extends Vehicle {
    @Override
    void speed() {
        System.out.println("Bike runs at 80 km/h");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();   
        Vehicle myBike = new Bike(); 

        myCar.speed();   // Output: Car runs at 100 km/h
        myBike.speed();  // Output: Bike runs at 80 km/h
    }
}