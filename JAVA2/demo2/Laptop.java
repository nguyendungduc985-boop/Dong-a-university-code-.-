package demo2;

public class Laptop {
    String name;
    String brand;
    double unitPrice;
    double tax;

    public Laptop(String name, String brand, double unitPrice, double tax) {
        this.name = name;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.tax = tax;
    }

    public void showInfo() {
        System.out.println("Laptop: " + name + " | Brand: " + brand + " | Giá thực: " + calculateRealPrice());
    }

    public double calculateRealPrice() {
        return this.unitPrice + this.tax; // Fix logic: chỉ cộng thuế 1 lần
    }
}