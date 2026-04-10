import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;
    
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}

class Library {
    private ArrayList<Book> books;
    
    public Library() {
        books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }
    
    public void removeBook(String ISBN) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).ISBN.equals(ISBN)) {
                System.out.println("Book removed: " + books.get(i).title);
                books.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }
    
    public void displayAllBooks() {
        System.out.println("=== Library Books ===");
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
        System.out.println();
    }
}

public class Question2_BookLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        
        Book book1 = new Book("Java Programming", "James Gosling", "123-456-789");
        Book book2 = new Book("Data Structures", "Robert Lafore", "987-654-321");
        Book book3 = new Book("Algorithms", "Thomas Cormen", "555-666-777");
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        library.displayAllBooks();
        
        library.removeBook("987-654-321");
        library.displayAllBooks();
        
        library.removeBook("999-999-999");
    }
}
