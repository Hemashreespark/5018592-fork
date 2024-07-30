package Librarypackage;

import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        // Setup: Create a list of books
        Book[] books = new Book[] {
            new Book(1, "The Catcher in the Rye", "J.D. Salinger"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "Moby Dick", "Herman Melville")
        };

        // Test Linear Search
        Library library = new Library();
        Book book = library.findBookByTitleLinear(books, "1984");
        System.out.println("Linear Search Result: " + (book != null ? book.getTitle() : "Not found"));

        // Test Binary Search
        // First, sort the array by title
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        
        book = library.findBookByTitleBinary(books, "To Kill a Mockingbird");
        System.out.println("Binary Search Result: " + (book != null ? book.getTitle() : "Not found"));
        
        // Test Binary Search with a non-existing title
        book = library.findBookByTitleBinary(books, "The Great Gatsby");
        System.out.println("Binary Search Result for 'The Great Gatsby': " + (book != null ? book.getTitle() : "Not found"));
    }
}
