package hust.soict.hedspi.test.cart.CartTest;
import hust.soict.hedspi.aims.cart.Cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Create sample DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "The Lion King", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Science Fiction", "Star Wars", "George Lucas", 124, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladdin", 18.99);

        // Add DVDs to the cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Test print method
        cart.print();

        // Test search by ID
        System.out.println("\nSearching for DVD with ID 1:");
        cart.searchById(1);

        System.out.println("\nSearching for DVD with ID 5:");
        cart.searchById(3);

        System.out.println("\nSearching for DVD with ID 5:");
        cart.searchById(5);

        // Test search by title
        System.out.println("\nSearching for DVD with title 'Aladdin':");
        cart.searchByTitle("Aladdin");

        System.out.println("\nSearching for DVD with title 'Frozen':");
        cart.searchByTitle("Frozen");
    }
}
