class LibraryItem {
    String title;
    String author;
    int id;
    boolean isIssued;
    int dueDay;

    LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isIssued = false;
    }

    void issue(int dueDay) {
        if (!isIssued) {
            isIssued = true;
            this.dueDay = dueDay;
            System.out.println(title + " issued. Due on day " + dueDay);
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    void returnItem(int returnDay) {
        if (isIssued) {
            isIssued = false;
            int fee = calculateLateFee(returnDay);
            System.out.println(title + " returned. Late Fee = " + fee);
        } else {
            System.out.println(title + " was not issued.");
        }
    }

    
    int calculateLateFee(int returnDay) {
        return 0;
    }
}


class Book extends LibraryItem {
    Book(String title, String author, int id) {
        super(title, author, id);
    }

    int calculateLateFee(int returnDay) {
        int daysLate = returnDay - dueDay;
        return (daysLate > 0) ? daysLate * 2 : 0;  // 2 per day late
    }
}


class Magazine extends LibraryItem {
    Magazine(String title, String author, int id) {
        super(title, author, id);
    }

    int calculateLateFee(int returnDay) {
        int daysLate = returnDay - dueDay;
        return (daysLate > 0) ? daysLate * 1 : 0;  // 1 per day late
    }
}


class DVD extends LibraryItem {
    DVD(String title, String author, int id) {
        super(title, author, id);
    }

    int calculateLateFee(int returnDay) {
        int daysLate = returnDay - dueDay;
        return (daysLate > 0) ? daysLate * 5 : 0;  // 5 per day late
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
       
        Book b1 = new Book("Java Basics", "James Gosling", 1);
        Magazine m1 = new Magazine("Tech Monthly", "Editor A", 2);
        DVD d1 = new DVD("Inception", "Nolan", 3);

        
        b1.issue(10);       
        b1.returnItem(12);  

        
        d1.issue(5);        
        d1.returnItem(8);   
    }
}