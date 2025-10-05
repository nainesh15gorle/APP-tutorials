// Base class
class Patient {
    String name;
    int age;

    // Constructor
    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display common details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class for InPatient
class InPatient extends Patient {
    int roomNumber;

    // Constructor
    InPatient(String name, int age, int roomNumber) {
        super(name, age); // call parent constructor
        this.roomNumber = roomNumber;
    }

    // Override to show extra info
    @Override
    void displayDetails() {
        super.displayDetails(); // show common details
        System.out.println("Room Number: " + roomNumber);
    }
}

// Derived class for OutPatient
class OutPatient extends Patient {
    String appointmentDate;

    // Constructor
    OutPatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    // Override to show extra info
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Appointment Date: " + appointmentDate);
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        InPatient p1 = new InPatient("Alice", 30, 101);
        OutPatient p2 = new OutPatient("Bob", 25, "2025-09-05");

        System.out.println("--- InPatient Details ---");
        p1.displayDetails();

        System.out.println("\n--- OutPatient Details ---");
        p2.displayDetails();
    }
}
