package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.DVD;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private List<Media> itemsInCart;

    // Constructor
    public Cart() {
        itemsInCart = new ArrayList<>();
    }

    // Method to add a media to the cart
    public void addMedia(Media media) {
        if (!itemsInCart.contains(media)) {
            itemsInCart.add(media);
            System.out.println("Media added to the cart: " + media.getTitle());
        } else {
            System.out.println("Media already exists in the cart: " + media.getTitle());
        }
    }

    // Method to remove a media from the cart
    public void removeMedia(Media media) {
        if (itemsInCart.contains(media)) {
            itemsInCart.remove(media);
            System.out.println("Media removed from the cart: " + media.getTitle());
        } else {
            System.out.println("Media not found in the cart: " + media.getTitle());
        }
    }

    public void filterMediaInCart(Scanner scanner) {
        System.out.println("Filter by (1) ID or (2) Title:");
        int filterChoice = scanner.nextInt();
        scanner.nextLine();  
        switch (filterChoice) {
            case 1:
                System.out.println("Enter the ID of the media:");
                int id = scanner.nextInt();
                scanner.nextLine();  
                boolean found = false;
                for (Media media : itemsInCart) {
                    if (media.getId() == id) {
                        System.out.println(media);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("No media found with ID: " + id);
                }
                break;
            case 2:
                System.out.println("Enter the title of the media:");
                String title = scanner.nextLine();
                found = false;
                for (Media media : itemsInCart) {
                    if (media.getTitle().equalsIgnoreCase(title)) {
                        System.out.println(media);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("No media found with title: " + title);
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    
    public void sortMediaInCart(Scanner scanner) {
        System.out.println("Sort by (1) Title or (2) Cost:");
        int sortChoice = scanner.nextInt();
        scanner.nextLine(); 
        switch (sortChoice) {
            case 1:
                itemsInCart.sort(Comparator.comparing(Media::getTitle));
                break;
            case 2:
                itemsInCart.sort(Comparator.comparingDouble(Media::getCost));
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
        }
        System.out.println("Sorted media in cart:");
        for (Media media : itemsInCart) {
            System.out.println(media);
        }
    }
    
    public void playMediaInCart(Scanner scanner) {
        if (itemsInCart.isEmpty()) {
            System.out.println("The cart is currently empty.");
            return;
        }

        System.out.println("Enter the title of the media to play:");
        String title = scanner.nextLine();
        Media foundMedia = itemsInCart.stream()
                                       .filter(media -> media.getTitle().equalsIgnoreCase(title))
                                       .findFirst()
                                       .orElse(null);

        if (foundMedia != null && foundMedia instanceof Playable) {
            ((Playable) foundMedia).play();
        } else if (foundMedia != null) {
            System.out.println("This media cannot be played.");
        } else {
            System.out.println("Media not found in the cart.");
        }
    }

    
    public void emptyCart() {
        itemsInCart.clear();
        System.out.println("The cart has been emptied.");
    }
    
    public void removeMediaByTitle(String title) {
        Media mediaToRemove = null;
        for (Media media : itemsInCart) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                mediaToRemove = media;
                break;
            }
        }
        if (mediaToRemove != null) {
            itemsInCart.remove(mediaToRemove);
            System.out.println(title + " has been removed from the cart.");
        } else {
            System.out.println(title + " not found in the cart.");
        }
    }
    // Method to display all medias in the cart
    public void displayCart() {
        if (itemsInCart.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (Media media : itemsInCart) {
                System.out.println(media.toString());
            }
        }
    }

    // Method to count the number of DVDs in the cart
    public int countDVDs() {
        int dvdCount = 0;
        for (Media media : itemsInCart) {
            if (media instanceof DVD) {
                dvdCount++;
            }
        }
        return dvdCount;
    }

    // Method to sort medias by title (alphabetical order, then by cost descending)
    public void sortByTitle() {
        itemsInCart.sort(Comparator.comparing(Media::getTitle).thenComparing(Comparator.comparing(Media::getCost).reversed()));
        System.out.println("Medias sorted by title and cost.");
    }

    // Method to sort medias by cost (descending order, then by title alphabetical)
    public void sortByCost() {
        itemsInCart.sort(Comparator.comparing(Media::getCost).reversed().thenComparing(Media::getTitle));
        System.out.println("Medias sorted by cost and title.");
    }

    // Method to find a media by title
    public Media findMediaByTitle(String title) {
        for (Media media : itemsInCart) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        System.out.println("No media found with title: " + title);
        return null;
    }
    
    public void clearCart() {
        itemsInCart.clear();
        System.out.println("The cart has been cleared.");
    }
    
    public boolean isEmpty() {
        return itemsInCart.isEmpty();
    }

    public List<Media> getMediaList() {
        return new ArrayList<>(itemsInCart);
    }
    
}
