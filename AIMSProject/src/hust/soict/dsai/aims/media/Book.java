package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book(int id, String title, String category, float cost, List<String> authors) {
		// TODO Auto-generated constructor stub
		super(id, title, category, cost);
//		this.id = id;
//		this.title = title;
//		this.category = category;
//		this.cost = cost;
		this.authors = authors;
	}
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("Author: " + authorName + "be added to the book");
		}else {
			System.out.println("Author: " + authorName + "is already associated to the book");
		}
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author " + authorName + " removed from the book.");
        } else {
            System.out.println("Author " + authorName + " is not associated with the book.");
        }
	}
	
	@Override
    public String toString() {
		return "ID: " + getId() +"Title: " + getTitle() + ", Category: " + getCategory() + ", Cost: " + getCost() + ", Author: " + getAuthors();
    }
	
}
