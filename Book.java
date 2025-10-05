public class Book {
    private String title;
    private String author;
    private String id;
    private int pages;
    private boolean issued = false;

    public Book(String title, String author, String id, int pages) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.pages = pages;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public String getId() {
        return id;
    }

    public double calculateLateFee() {
        // Example: $1 per day late fee
        return 10.0;
    }
}