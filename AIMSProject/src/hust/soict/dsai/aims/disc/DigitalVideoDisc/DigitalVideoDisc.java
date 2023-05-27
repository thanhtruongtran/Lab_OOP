package hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	private String title;
	private String categoryString;
	private String director; 
	private int length; 
	private float cost;
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String categoryString, float cost) {
		super();
		this.title = title;
		this.categoryString = categoryString;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String categoryString, String director, float cost) {
		super();
		this.title = title;
		this.categoryString = categoryString;
		this.director = director;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String categoryString, String director, int length, float cost) {
		super();
		this.title = title;
		this.categoryString = categoryString;
		this.director = director;
		this.length = length;
		this.cost = cost;
		
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public String getCategoryString() {
		return categoryString;
	}
	
	public String getDirector() {
		return director;
	}
	
	public int getLength() {
		return length;
	}
	
	public float getCost() {
		return cost;
	} 
	
	public int getId() {
		return id;
	}
	
	public boolean isMatch(String title) {
	    String[] keywords = title.toLowerCase().split(" ");
	    String discTitle = this.title.toLowerCase();
	    for (String keyword : keywords) {
	        if (!discTitle.contains(keyword)) {
	            return false;
	        }
	    }
	    return true;
	}

	
	public String toString() {
		return "DVD - " + title + " - " + categoryString + " - " + director + " - " + length + ": " + cost + " $";
	}
	
}
