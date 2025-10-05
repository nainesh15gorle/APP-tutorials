import java.io.*;
import java.util.*;

class Room {
    private int roomNumber;
    private String type;
    private double price;
    private boolean available;
    
    public Room(int num, String type, double price) {
        this.roomNumber = num;
        this.type = type;
        this.price = price;
        this.available = true;
    }
    
    // Getters and setters
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}

class Customer {
    private String name;
    private String contact;
    
    public Customer(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }
}

class Reservation {
    private Customer customer;
    private Room room;
    private Date date;
    
    public Reservation(Customer customer, Room room, Date date) {
        this.customer = customer;
        this.room = room;
        this.date = date;
    }
    
    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("reservations.csv", true))) {
            writer.println(customer.getName() + "," + room.getRoomNumber() + "," + date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Hotel {
    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    
    public void addRoom(Room room) {
        rooms.add(room);
    }
    
    public List<Room> findAvailableRooms(Date date) {
        List<Room> available = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) available.add(room);
        }
        return available;
    }
    
    public void makeReservation(Customer customer, Room room, Date date) {
        if (room.isAvailable()) {
            room.setAvailable(false);
            Reservation reservation = new Reservation(customer, room, date);
            reservations.add(reservation);
            reservation.saveToFile();
        }
    }
}
