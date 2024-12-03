package hust.soict.hedspi.aims.media;

public class CD extends Disc {
    // Constructor
    public CD(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    // Optional: You can override the toString() method if you want specific behavior for CD
    @Override
    public String toString() {
        return "CD [id=" + getId() + ", title=" + getTitle() + ", category=" + getCategory() + ", cost=" + getCost() + ", length=" + getLength() + ", director=" + getDirector() + "]";
    }
}
