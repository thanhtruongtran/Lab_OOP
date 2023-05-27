package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;

public class StoreTest {
	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        
        Store store = new Store(5);
        store.listItems();
        
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.listItems();
        
        store.removeDVD(dvd2);
        store.listItems();
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 16.99f);
        store.addDVD(dvd4);
        store.listItems();
        
        store.addDVD(dvd1);
    }
}
