package libraryManagementSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private static final Book[] book = null;

	private List<Book> collection;
	private HashMap<String,Patron> patrons;

	private Object patron;
	
	
	public Library() {
		new ArrayList<Book>();
		this.setPatrons(new HashMap<>());
	}
    public void addBook(Book book ) {
    	collection.add(book);
    	
    }
    @Override 
    public String toString() {
    	String total = "\n";
    	for (int i= 0; i<collection.size();i++) {
    		Book b = collection.get(i);
    		total = total + b.toString();
    	}
    	
		return total;
    	
    }
	public void registerPatron(Patron patrons) {
		patron = null;
		patrons.put(((Patron) patron).getPatronId(),patron);
		
	
	}
	public void listAvailableBooks() {	
		if (Book.isEmpty()) {
			System.out.println("No books available in the Library.");
		} else {
			System.out.println("Available Books:");
			for (Book book : book) {
			System.out.println(book);
			}
		}
		
		
	}
	public String borrowBook(String string, String string2) {
		return null;
	}
	public String returnBook(String string, String string2) {
		return null;
	}
	public HashMap<String,Patron> getPatrons() {
		return patrons;
	}
	public void setPatrons(HashMap<String,Patron> patrons) {
		this.patrons = patrons;
	}
}
 