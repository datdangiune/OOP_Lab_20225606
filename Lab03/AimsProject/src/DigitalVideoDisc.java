public class DigitalVideoDisc {
    private String title;
    private String category;
    private double cost;
    private String director;
    private int length;

    // Class variable to track the total number of DVDs created
    private static int nbDigitalVideoDiscs = 0;

    // Instance variable for unique ID
    private int id;

    // Constructor with all parameters
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.title = title.trim(); // Chuẩn hóa tiêu đề
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++; // Increment class counter
        this.id = nbDigitalVideoDiscs; // Assign unique ID
    }

    // Constructor with category, title, length, and cost
    public DigitalVideoDisc(String title, String category, int length, double cost) {
        this.title = title.trim(); // Chuẩn hóa tiêu đề
        this.title = title;
        this.category = category;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor with category, title, and cost
    public DigitalVideoDisc(String category, String title, double cost) {
        this.category = category;
        this.title = title.trim(); // Chuẩn hóa tiêu đề
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title) {
        this.title = title.trim(); // Loại bỏ khoảng trắng thừa
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
    }
    
    // toString method for displaying DVD details
    @Override
    public String toString() {
        return title + " - " + (category != null ? category : "Unknown") +
                " - " + (director != null ? director : "N/A") +
                " - " + (length > 0 ? length + " mins" : "Unknown length") +
                ": " + cost + " $";
    }

    // Check if the title matches (case insensitive)
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    // Getters and Setters
    public int getId() {
        return id;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
}
