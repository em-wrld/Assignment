package libraryManagementSystem;

import java.io.Serializable;

public class Book implements Serializable {
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String title;
		private String author;
		private String isbn;
		
		public Book() {
			title = null;
			author = null;
			isbn = "0" ;
			
		}
		public Book (String title,String author,String isbn) {
			this.title = title;
			this.author = author;
			this.isbn = isbn;
			
		}
       
	@Override 
       public String toString() {
    	   return "\nTitle: " + title + "\nAuthor:" + author + "\nISBN:" + isbn + "\n" ;
    	   
	}
	   public static boolean isEmpty() {
		return false;
	}

}
