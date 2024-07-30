package Librarypackage;
import java.util.Arrays;
public class Library {
    public Book findBookByTitleLinear(Book[] books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    
    public Book findBookByTitleBinary(Book[] books, String title) {
        
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else { 
                return books[mid];
            }
        }
        return null; 
    }
}
