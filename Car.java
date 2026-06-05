class Car {
    String brand;
    double price;
    static String company = "ABC Motors";

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Company: " + company);
        System.out.println();
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Honda";
        c1.price = 800000;

        Car c2 = new Car();
        c2.brand = "Hyundai";
        c2.price = 900000;

        Car c3 = new Car();
        c3.brand = "Toyota";
        c3.price = 1200000;

        c1.display();
        c2.display();
        c3.display();
    }
}