package demo;

public class monan {
    public static void main(String[] args) {
        food sp1 = new food("Com rang", 50000, 0.1);
        food sp2 = new food("Pho bo", 60000, 0.05);
        food sp3 = new food("KFC", 50000, 0.2);
        customer kh1 = new customer("Nguyen Van A", "0123456789", "36 Thanh Hoa");

        order order1 = new order(kh1);
        order1.add(sp1);
        order1.add(sp2);
        order1.add(sp3);
        order1.Showinfo();
    }
}