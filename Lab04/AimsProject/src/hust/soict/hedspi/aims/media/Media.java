package hust.soict.hedspi.aims.media;

public class Media implements Comparable<Media> {
    private int id;
    private String title;
    private String category;
    private float cost;

    // Constructor
    public Media() {
        // Default constructor
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Default comparison by title first, then by cost (descending)
    @Override
    public int compareTo(Media other) {
        // Compare by title first
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison; // If titles are different, return the result of title comparison
        }

        // If titles are the same, compare by cost (descending order)
        return Float.compare(other.cost, this.cost); // In descending order, swap this and other
    }

    // toString() method to display media details
    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }

    // Additional methods if needed...
}
