package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	//private static int nbDigitalVideoDiscs = 0;
//	private String director; 
//	private int length; 
	
//	public DigitalVideoDisc(String title) {
//		super();
//		this.title = title;
//	}
//	
//	public DigitalVideoDisc(String title, String category, float cost) {
//		super();
//		this.title = title;
//		this.category = category;
//		this.cost = cost;
//	}
//	
//	public DigitalVideoDisc(String title, String category, String director, float cost) {
//		super();
//		this.title = title;
//		this.category = category;
//		this.director = director;
//		this.cost = cost;
//	}
//	
//	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
//		super();
//		this.title = title;
//		this.category = category;
//		this.director = director;
//		this.length = length;
//		this.cost = cost;
//		
//		nbDigitalVideoDiscs++;
//	    this.id = nbDigitalVideoDiscs;
//	}
	
	public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }
	
//	public String getDirector() {
//		return director;
//	}
//	
//	public int getLength() {
//		return length;
//	}
	
	public boolean isMatch(String title) {
	    String[] keywords = title.toLowerCase().split(" ");
	    String discTitle = this.getTitle().toLowerCase();
	    for (String keyword : keywords) {
	        if (!discTitle.contains(keyword)) {
	            return false;
	        }
	    }
	    return true;
	}

	
	@Override
    public String toString() {
        return "ID: " + getId() + ", Title: " + getTitle() + ", Category: " + getCategory() + ", Cost: " + getCost() + ", Director: " + getDirector() + ", Length: " + getLength();
    }
	
	@Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD Length: " + getLength());
    }
	
}
