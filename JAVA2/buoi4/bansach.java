package buoi4;

public class bansach {
    public static void main(String[] args) {
        Customer khachHang = new Customer("Nguyen Duc Dung", "0909123456", "dung@email.com");
        BookOrder order = new BookOrder(khachHang);

        Book sach1 = new Book("Nam Cao", "Chi Pheo", 50000.0);
        Book sach2 = new Book("To Hoai", "De Men", 70000.0);
        
        order.addBook(sach1);
        order.addBook(sach2);

        order.printInvoice();
    }
}