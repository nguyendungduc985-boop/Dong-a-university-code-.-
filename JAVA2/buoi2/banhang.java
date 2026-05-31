package buoi2;

public class banhang {
    public static void main(String[] args) {
    System.out.println("Ban hang");
    Products sp1 = new Products("Nuoc Cam", 20000000, 10.5f);
    Products sp2 = new Products("Nuoc Chanh", 15000000, 5.5f);
    Customer kh1 = new Customer("Nguyen Van A", "0123456789", "36 Thanh Hóa,RAU MA PHA DUONG TAU");

    Order order1 = new Order(kh1);
    order1.addProduct(sp1);
    order1.addProduct(sp2);
    order1.Showinfo();
}
}

 
