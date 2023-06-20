package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import hust.soict.dsai.aims.exception.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.Collections;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	
	public void addMedia(Media medium) throws CartFullException {
		if (this.itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			throw new CartFullException("The cart is full.");
		} else {
			this.itemsOrdered.add(medium);
			System.out.println(medium.getTitle() + " has beed added to the cart.");
		}
	}
	
	public void removeMedia(Media medium) throws NonExistingItemException {
		if (this.itemsOrdered.remove(medium)) {
			System.out.println(medium.getTitle() + " has been removed from the cart.");
		} else {
			throw new NonExistingItemException(medium.getTitle() + " is not in the cart.");
		}
	}

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
    
    public void printCart() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for (int i=0; i<itemsOrdered.size(); i++) {
    		System.out.println((i+1) + "." + itemsOrdered.get(i).toString());
    	}
    	System.out.println("Total cost: " + totalCost() + "$");
    	System.out.println("***************************************************");
    }
    
    public void searchByID(int id) {
        boolean match = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found a match: " + media.toString());
                match = true;
                break;
            }
        }
        if (!match) {
            System.out.println("No match found.");
        }
    }
    
    public void searchByTitle(String title) {
        boolean match = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Found a match: " + media.toString());
                match = true;
                break;
            }
        }
        if (!match) {
            System.out.println("No match found.");
        }
    }
    
    public int getSize() {
		return this.itemsOrdered.size();
	}
    
    public Media searchMedia(String title) {
		for (Media medium: this.itemsOrdered) {
			if (medium.getTitle().toLowerCase().equals(title.toLowerCase())) {
				return medium;
			}
		}
		return null;
	}
    
    public void sortByTitle() {
		Collections.sort(this.itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	
	public void sortByCost() {
		Collections.sort(this.itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
	
	public ObservableList<Media> getItemsOrdered() {
		return this.itemsOrdered;
	}
	
	public void empty() {
		this.itemsOrdered.clear();
	}
}
