class Wrapper<T> {
    public T value;

    public Wrapper(T value) {
        this.value = value;
    }
}

public class TestPassingParameter {

    public static void main(String[] args) {

        Wrapper<DigitalVideoDisc> jungleWrapper = new Wrapper<>(new DigitalVideoDisc("Jungle"));
        Wrapper<DigitalVideoDisc> cinderellaWrapper = new Wrapper<>(new DigitalVideoDisc("Cinderella"));

        System.out.println("Before swap:");
        System.out.println("jungle dvd title: " + jungleWrapper.value.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaWrapper.value.getTitle());

        swap(jungleWrapper, cinderellaWrapper);

        System.out.println("After swap:");
        System.out.println("jungle dvd title: " + jungleWrapper.value.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaWrapper.value.getTitle());

        changeTitle(jungleWrapper.value, cinderellaWrapper.value.getTitle());
        System.out.println("After changeTitle:");
        System.out.println("jungle dvd title: " + jungleWrapper.value.getTitle());
    }

    public static void swap(Wrapper<DigitalVideoDisc> wrapper1, Wrapper<DigitalVideoDisc> wrapper2) {
        DigitalVideoDisc temp = wrapper1.value;
        wrapper1.value = wrapper2.value;
        wrapper2.value = temp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle); 
    }
}
