package hust.soict.hedspi.aims.media;

public class DVD extends Media implements Playable {
    private String director;
    private int length; // Duration of the DVD in minutes

    // Default constructor
    public DVD() {
        super();
        this.director = "";
        this.length = 0;
    }

    // Parameterized constructor
    public DVD(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    // Getter and Setter for director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Getter and Setter for length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("Directed by: " + director);
        System.out.println("Duration: " + length + " minutes");
    }

    @Override
    public String toString() {
        return "DVD [ID=" + getId() + ", Title=" + getTitle() + ", Category=" + getCategory() + ", Cost=" + getCost()
                + ", Director=" + director + ", Length=" + length + " minutes]";
    }
}
