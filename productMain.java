class product {
    int productId;
    String name;
    int price;

    product() {

    }

    product(int productId) {
        this.productId = productId;
    }

    product(int productId, String name) {
        this.productId = productId; 
        this.name = name;
    }

    product(int price, int productId, String name) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("ProductId: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
    void display(int productId, String name, int price) {
        System.out.println("ProductId: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class productMain {
    public static void main(String[] args) {
        product p1 = new product();
        product p2 = new product(101);
        product p3 = new product(101, "Laptop");
        product p4 = new product(50000, 101, "Laptop");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
