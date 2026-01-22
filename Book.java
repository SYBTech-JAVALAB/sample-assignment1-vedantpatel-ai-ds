class Book {

    String title;
    String author;
    double price;
    String isbn;
    int stock;

    Book(String title, String author, double price, String isbn, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.stock = stock;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("ISBN: " + isbn);
        System.out.println("Stock: " + stock);
        System.out.println("Available: " + isAvailable())
    }

    void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }

    void addStock(int amount) {
        stock += amount;
    }

    boolean isAvailable() {
        return stock > 0;
    }
}

public class BookStore {
    public static void main(String[] args) {
        Book novel = new Book(
                "XYZ",
                "Kunal Paldewar",
                25.00,
                "ISBN1111",
                5
        );

        Book textbook = new Book(
                "Advanced Mathematics",
                "Devanshu Rai",
                90.00,
                "ISBN2222",
                0
        );

        System.out.println("Initial Book Details");
        novel.displayInfo();
        textbook.displayInfo();
        novel.applyDiscount(10);      
        textbook.applyDiscount(20);   
        novel.addStock(3);
        textbook.addStock(10);
        System.out.println("Updated Book Details");
        novel.displayInfo();
        textbook.displayInfo();
    }
}
