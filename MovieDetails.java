class Movie {
    String title;
    int generation;
    int rating;

    Movie(String t, int gen, int r) {
        title = t;
        generation = gen;
        rating = r;
    }

    void Display() {
        System.out.println("Title: " + title + " Generation: " + generation + " Rating: " + rating);
    }
}

public class MovieDetails {
    public static void main(String[] args) {
        Movie m1 = new Movie("Coolie", 2025, 5);
        m1.Display();
    }
}