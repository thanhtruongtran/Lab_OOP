package hust.soict.dsai.aims.store.Store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc itemsInStore[];
	private int currentIndex = 0;
	
	public Store(int size) {
		itemsInStore = new DigitalVideoDisc[size];
	}
	
	public void addDVD(DigitalVideoDisc dvd) {
		if (currentIndex < itemsInStore.length) {
			itemsInStore[currentIndex] = dvd;
			currentIndex++;
			System.out.println("Added DVD: " + dvd.getTitle());
		} else {
			System.out.println("Cannot add DVD, store is full.");
		}
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		for (int i=0; i<currentIndex; i++) {
			if (itemsInStore[i] == dvd) {
				for (int j=i; j<currentIndex-1; j++) {
					itemsInStore[j] = itemsInStore[j+1];
				}
				itemsInStore[currentIndex-1] = null;
				currentIndex--;
                System.out.println("Removed DVD: " + dvd.getTitle());
                return;
			}
		}
		System.out.println("DVD not found in store.");
	}
	
	public void listItems() {
        System.out.println("Items in store:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println((i+1) + ". " + itemsInStore[i].getTitle());
        }
    }
}
