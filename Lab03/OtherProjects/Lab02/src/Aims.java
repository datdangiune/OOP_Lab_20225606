public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Action", "Movie 1", 15.99);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Comedy", "Movie 2", 12.99);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Movie 3");

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost: " + cart.totalCost());

        cart.removeDigitalVideoDisc(dvd1);
        System.out.println("Total cost after removing dvd1: " + cart.totalCost());
    }
}
