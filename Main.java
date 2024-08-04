public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "1234567890"));
        library.addBook(new Book("1984", "George Orwell", "1234567891"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567892"));

        // List all books
        System.out.println("All books in the library:");
        library.listBooks();

        // Find a book by title
        System.out.println("\nFinding book by title '1984':");
        Book book = library.findBookByTitle("1984");
        System.out.println(book != null ? book : "Book not found");

        // Check out a book
        if (book != null) {
            book.checkOut();
        }

        // List all books after checking out one
        System.out.println("\nAll books in the library after checking out '1984':");
        library.listBooks();
        
        // Return the book
        if (book != null) {
            book.returnBook();
        }

        // List all books after returning one
        System.out.println("\nAll books in the library after returning '1984':");
        library.listBooks();
    }
}
