public class Store {
    private static final int MAX_ITEMS_IN_STORE = 50; // Maximum DVDs the store can hold
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0; // Current number of DVDs in the store

    // Add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_ITEMS_IN_STORE) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("DVD \"" + dvd.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    // Remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) { // Match based on object reference
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null; // Clear last element
                qtyInStore--;
                System.out.println("DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
                return;
            }
        }
        System.out.println("DVD \"" + dvd.getTitle() + "\" was not found in the store.");
    }

    // Print all DVDs in the store
    public void printStore() {
        System.out.println("***********************STORE***********************");
        if (qtyInStore == 0) {
            System.out.println("The store is empty.");
        } else {
            for (int i = 0; i < qtyInStore; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i]);
            }
        }
        System.out.println("***************************************************");
    }
}
