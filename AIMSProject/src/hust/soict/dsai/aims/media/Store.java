package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Added " + media.getTitle() + " to the store.");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Removed " + media.getTitle() + " from the store.");
        } else {
            System.out.println("Item not found in the store.");
        }
    }

	
	public void listItems() {
        System.out.println("Items in store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i+1) + ". " + itemsInStore.get(i).getTitle());
        }
    }
}
