package hust.soict.hedspi.aims.media;

public class Book extends Media {
    // Constructor
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    @Override
    public String toString() {
        return "Book [id=" + getId() + ", title=" + getTitle() + ", category=" + getCategory() + ", cost=" + getCost() + "]";
    }
}
