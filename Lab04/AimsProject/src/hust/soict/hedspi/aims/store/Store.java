package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private ArrayList<Media> itemsInStore;

    // Constructor
    public Store() {
        itemsInStore = new ArrayList<>();
    }

    // Method to add media to the store
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Media added to the store: " + media.getTitle());
        } else {
            System.out.println("Media already exists in the store: " + media.getTitle());
        }
    }

    // Method to remove media from the store
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Media removed from the store: " + media.getTitle());
        } else {
            System.out.println("Media not found in the store: " + media.getTitle());
        }
    }

    // Method to find media by title
    public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        System.out.println("No media found with the title: " + title);
        return null;
    }

    // Method to display all items in the store
    public void displayStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Items in the store:");
            for (Media media : itemsInStore) {
                System.out.println(media.toString());
            }
        }
    }
    
    public List<Media> getMediaList() {
        return new ArrayList<>(itemsInStore);  // Return a copy of the list
    }
}
