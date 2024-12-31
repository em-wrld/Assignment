package libraryManagementSystem;

public class App {
	
	public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("Weathering Heights","Emily Bronte","235"));
        library.addBook(new Book("Pride and Prejudice","Jane Austen","487"));
        

        // Register patrons
        Patron patron1 = new Patron("Emily", "P001");
        Patron patron2 = new Patron("Erica", "P002");
        library.registerPatron(patron1);
        library.registerPatron(patron2);

        // Simulate operations
        library.listAvailableBooks();

        System.out.println("\nEmily borrows 'Weathering Heights': " + library.borrowBook("235", "P001"));
        library.listAvailableBooks();

        System.out.println("\nEmily returns 'Weathering Heights': " + library.returnBook("235", "P001"));
        library.listAvailableBooks();
    }
}

