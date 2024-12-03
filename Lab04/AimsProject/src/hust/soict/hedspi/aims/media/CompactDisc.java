package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    // Default Constructor
    public CompactDisc() {
        super();
    }

    // Parameterized Constructor
    public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Add a track
    public boolean addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists: " + track.getTitle());
            return false;
        }
        tracks.add(track);
        return true;
    }

    // Remove a track
    public boolean removeTrack(Track track) {
        if (!tracks.contains(track)) {
            System.out.println("Track does not exist: " + track.getTitle());
            return false;
        }
        tracks.remove(track);
        return true;
    }

    // Get total length of the CD
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        if (getLength() > 0) {
            System.out.println("Playing CD: " + getTitle());
            System.out.println("CD length: " + getLength() + " seconds");
            for (Track track : tracks) {
                track.play();
            }
        } else {
            System.out.println("Cannot play this CD: " + getTitle() + " (invalid length)");
        }
    }
}
