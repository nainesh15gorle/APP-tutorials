abstract class Vehicle {
    protected int speed;
    protected int fuelCapacity;
    
    public Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }
    
    public void start() { System.out.println("Vehicle started"); }
    public abstract void displayFeatures();
}

class Car extends Vehicle {
    private int doors;
    public Car(int speed, int fuelCapacity, int doors) {
        super(speed, fuelCapacity);
        this.doors = doors;
    }
    @Override public void displayFeatures() {
        System.out.println("Car with " + doors + " doors");
    }
}

class Bike extends Vehicle {
    private boolean hasCarrier;
    public Bike(int speed, int fuelCapacity, boolean hasCarrier) {
        super(speed, fuelCapacity);
        this.hasCarrier = hasCarrier;
    }
    @Override public void displayFeatures() {
        System.out.println("Bike with carrier: " + hasCarrier);
    }
}

// Add a main method for testing
public class Main {
    public static void main(String[] args) {
        Car car = new Car(120, 50, 4);
        Bike bike = new Bike(80, 15, true);

        car.start();
        car.displayFeatures();

        bike.start();
        bike.displayFeatures();
    }
}