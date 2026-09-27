class book {
    int bookId;
    String title;
    int price;

    book() {

    }

    book(int bookId) {
        this.bookId = bookId;
    }

    book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    book(int price, int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    book(book b) {
        this.bookId = b.bookId;
        this.title = b.title;
        this.price = b.price;
    }

    public void display() {
        System.out.println("BookId: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class bookMain {
    public static void main(String[] args) {
        book b1 = new book();
        book b2 = new book(101);
        book b3 = new book(101, "Java");
        book b4 = new book(500, 101, "Java");
        book b5 = new book(b4);
        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
    }
}