package hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int quantity = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (quantity < MAX_NUMBERS_ORDERED) {
            itemsOrdered[quantity++] = disc;
            System.out.println("Added \"" + disc.getTitle() + "\" to the cart.");
        } else {
            System.out.println("The cart is already full, cannot add more items.");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    	int index = -1;
    	for (int i=0; i<quantity; i++) {
    		if (itemsOrdered[i] == disc) {
    			index = i;
    			break;
    		}
    	}
    	
    	if (index >= 0) {
    		for (int i=index; i<quantity-1; i++) {
    			itemsOrdered[i] = itemsOrdered[i+1];
    		}
    		itemsOrdered[quantity-1] = null;
    		quantity--;
    		System.out.println("Removed \"" + disc.getTitle() + "\" from the cart.");
    	}else {
    		System.out.println("The disc is not in the cart");
    	}
    }
    
    public float totalCost() {
		float totalcost = 0.0f;
		for (int i=0; i<quantity; i++) {
			totalcost += itemsOrdered[i].getCost();
		}
		return totalcost;
	}
    
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    	int count = 0;
    	for (DigitalVideoDisc dvd : dvdList) {
    		if (quantity >= MAX_NUMBERS_ORDERED) {
    			System.out.println("The cart is already full, cannot add more items.");
    			break;
    		}
    		
    		itemsOrdered[quantity++] = dvd;
    		count++;
    	}
    	System.out.println("Added " + count + " DVDs to the cart.");   
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
        System.out.println("Added 2 DVDs to the cart.");
	}
    
    public void printCart() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for (int i=0; i<quantity; i++) {
    		System.out.println((i+1) + "." + itemsOrdered[i].toString());
    	}
    	System.out.println("Total cost: " + totalCost() + "$");
    	System.out.println("***************************************************");
    }
    
    public void searchByID(int id) {
    	boolean match = false;
    	for (int i=0; i<quantity; i++) {
    		if (itemsOrdered[i].getId() == id) {
    			System.out.println("Found a match " + itemsOrdered[i].toString());
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
		for (int i=0; i<quantity; i++) {
    		if (itemsOrdered[i].isMatch(title)) {
    			System.out.println("Found a match " + itemsOrdered[i].toString());
    			match = true;
    			break;
    		}
    	}
    	if (!match) {
    		System.out.println("No match found.");
    	}
	}
}
