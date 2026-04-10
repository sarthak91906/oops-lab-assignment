class BookDetails {
    private String title;
    private String author;
    private double price;
    
    public BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

public class Question19_BookArray {
    public static void main(String[] args) {
        BookDetails[] books = new BookDetails[5];
        
        books[0] = new BookDetails("Java Programming", "James Gosling", 45.99);
        books[1] = new BookDetails("Data Structures", "Robert Lafore", 55.50);
        books[2] = new BookDetails("Algorithms", "Thomas Cormen", 65.75);
        books[3] = new BookDetails("Design Patterns", "Erich Gamma", 42.25);
        books[4] = new BookDetails("Clean Code", "Robert Martin", 38.99);
        
        System.out.println("=== Library Book Collection ===");
        for (BookDetails book : books) {
            book.display();
        }
        
        double totalValue = 0;
        for (BookDetails book : books) {
            totalValue += book.getPrice();
        }
        
        System.out.println("\nTotal Library Value: $" + totalValue);
        System.out.println("Average Book Price: $" + (totalValue / books.length));
    }
}
