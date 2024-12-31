package libraryManagementSystem;

import java.io.Serializable;
import java.util.ArrayList;

public class Patron implements Serializable { 
	private static final long serialVersionUID = 1L;
	private String name;
	private String patronId;
	private ArrayList<Book> borrowedBooks;
	
	public Patron(String name, String patronId) {
		this.name = name;
		this.patronId = patronId;
		this.borrowedBooks = new ArrayList<>();
		
	}
	public boolean borrowBook(Book book) {
		if (borrowedBooks.size()< 3) { // Limit to 3 books
			borrowedBooks.add(book);
			return true;
		}
		return false;
		}
    public boolean returnBook(Book book) {
    	return borrowedBooks.remove(book);
    }
		public String getName() {
			return name;
		}
		public String getPatronId() {
			return patronId;
		}
		public ArrayList<Book> getBorrowedBooks(){
			return borrowedBooks;
	}
		public void put(String patronId2, Object patron) {
	
			
		}
	
	
	
	
	
	
	

}
