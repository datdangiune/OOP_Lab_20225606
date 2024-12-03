package hust.soict.hedspi.aims.media;

public class Disc extends Media {
    private int length;  // Duration of the disc (in minutes, for example)
    private String director;  // Director of the disc, e.g., for movies

    // Default Constructor
    public Disc() {
        super();  // Calls the no-argument constructor of Media
        this.length = 0;
        this.director = "";
    }

    // Parameterized Constructor
    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);  // Calls the parameterized constructor of Media
        this.length = length;
        this.director = director;
    }

    // Getter for length
    public int getLength() {
        return length;
    }

    // Setter for length
    public void setLength(int length) {
        this.length = length;
    }

    // Getter for director
    public String getDirector() {
        return director;
    }

    // Setter for director
    public void setDirector(String director) {
        this.director = director;
    }

    // Override toString() to provide a string representation of the Disc
    @Override
    public String toString() {
        return super.toString() + ", Length: " + length + " minutes, Director: " + director;
    }

    // Optionally, you can override equals() and hashCode() to compare and handle equality for Disc objects.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Disc disc = (Disc) obj;
        return length == disc.length && director.equals(disc.director);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + length + director.hashCode();
    }
}
