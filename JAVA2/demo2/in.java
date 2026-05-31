package demo2;
import java.util.ArrayList;

public class in {
    String invoiceID;
    Customer customer;
    ArrayList<Laptop> laptopItems; // Đổi từ food sang Laptop cho đồng bộ

    public in(String invoiceID, Customer customer) {
        this.invoiceID = invoiceID;
        this.customer = customer;
        this.laptopItems = new ArrayList<>();
    }

    public void addLaptop(Laptop item) {
        this.laptopItems.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Laptop item : laptopItems) {
            total += item.calculateRealPrice();
        }
        
        // Giảm giá 10% nếu là khách VIP
        if (customer.memberType.equalsIgnoreCase("vip")) {
            total *= 0.9;
        }
        return total;
    }

    public void showInvoice() {
        System.out.println("--- HÓA ĐƠN: " + invoiceID + " ---");
        customer.showInfo();
        System.out.println("Danh sách sản phẩm:");
        for (Laptop item : laptopItems) {
            item.showInfo();
        }
        System.out.println("=> TỔNG TIỀN (đã tính giảm giá nếu có): " + calculateTotal());
    }
}