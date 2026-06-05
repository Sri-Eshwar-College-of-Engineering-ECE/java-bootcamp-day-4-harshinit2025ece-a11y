class Product {
    int productId;
    String productName;
    static int totalProducts = 0;

    Product(int id, String name) {
        productId = id;
        productName = name;
        totalProducts++;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
    }

    public static void main(String[] args) {
        Product p1 = new Product(100, "WATCH");
        Product p2 = new Product(101, "MOBILE");
        Product p3 = new Product(102, "TABLE");

        p1.display();
        p2.display();
        p3.display();

        System.out.println("Total Products Created: " + totalProducts);
    }
}