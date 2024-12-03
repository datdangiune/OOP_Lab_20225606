package hust.soict.hedspi.aims.media;

public class Track extends Media {
    private int length;
    private String artist;

    public Track() {
        super();
    }

    public Track(int id, String title, String category, float cost, int length, String artist) {
        super(id, title, category, cost);
        this.length = length;
        this.artist = artist;
    }

    // Getter for length
    public int getLength() {
        return length;
    }

    // Setter for length
    public void setLength(int length) {
        this.length = length;
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Setter for artist
    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Phương thức play() để phát Track
    public void play() {
        System.out.println("Playing track: " + this.getTitle() + " by " + this.getArtist() + " for " + this.getLength() + " minutes.");
    }

    @Override
    public String toString() {
        return "Track [id=" + getId() + ", title=" + getTitle() + ", category=" + getCategory() + ", cost=" + getCost() 
                + ", length=" + length + ", artist=" + artist + "]";
    }
}
