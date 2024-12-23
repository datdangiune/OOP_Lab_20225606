package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.cart.Cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Action", "Movie 1", 15.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Comedy", "Movie 2", 12.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Movie 3");

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost: " + cart.totalCost());

        cart.removeDigitalVideoDisc(dvd1);
        System.out.println("Total cost after removing dvd1: " + cart.totalCost());
    }
}
