
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
}
