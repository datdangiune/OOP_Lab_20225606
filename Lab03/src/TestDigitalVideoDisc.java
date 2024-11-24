public class TestDigitalVideoDisc {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Action", "Movie 1", 15.99);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Comedy", "Movie 2", 12.99);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Drama", "Movie 3", 18.49);

        System.out.println("DVD 1 ID: " + dvd1.getId() + ", Title: " + dvd1.getTitle());
        System.out.println("DVD 2 ID: " + dvd2.getId() + ", Title: " + dvd2.getTitle());
        System.out.println("DVD 3 ID: " + dvd3.getId() + ", Title: " + dvd3.getTitle());

        System.out.println("Total DVDs created: " + DigitalVideoDisc.getNbDigitalVideoDiscs());
    }
}

