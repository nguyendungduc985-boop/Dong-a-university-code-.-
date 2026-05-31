package demo2;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo các sản phẩm laptop
        Laptop sp1 = new Laptop("Dell XPS", "Dell", 25000000, 2500000);
        Laptop sp2 = new Laptop("Macbook M2", "Apple", 30000000, 3000000);

        // 2. Tạo khách hàng
        Customer kh1 = new Customer("C001", "Nguyen Van A", "vip");

        // 3. Tạo hóa đơn và thêm sản phẩm
        in hd1 = new in("HD_01", kh1);
        hd1.addLaptop(sp1);
        hd1.addLaptop(sp2);

        // 4. Hiển thị kết quả
        hd1.showInvoice();
    }
}