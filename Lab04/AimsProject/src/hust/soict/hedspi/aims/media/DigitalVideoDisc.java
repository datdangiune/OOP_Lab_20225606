package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    // Default Constructor
    public DigitalVideoDisc() {
        super();
    }

    // Parameterized Constructor
    public DigitalVideoDisc(int id, String title, String category, String director,int length, float cost) {
        super(id, title, category, cost, length, director);
    }

    

	@Override
    public void play() {
        if (getLength() > 0) {
            System.out.println("Playing DVD: " + getTitle());
            System.out.println("DVD length: " + getLength());
        } else {
            System.out.println("Cannot play this DVD: " + getTitle() + " (invalid length)");
        }
    }
}
