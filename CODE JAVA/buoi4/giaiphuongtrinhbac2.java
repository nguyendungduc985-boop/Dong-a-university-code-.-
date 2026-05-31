package buoi4;
import java.util.Scanner;

public class giaiphuongtrinhbac2 {
    // Giải phương trình bậc hai: ax² + bx + c = 0
    public static void main(String[] args) {
        // nhập a, b, c
        int a = nhapSoNguyen("Nhập a: ");
        int b = nhapSoNguyen("Nhập b: ");
        int c = nhapSoNguyen("Nhập c: ");
        System.out.printf("Bạn vừa nhập vào: a = %d, b = %d, c = %d%n", a, b, c);

        // nếu a = 0 → giải pt bậc nhất
        if (a == 0)
            giaiPTB1(b, c);
        else
            giaiPTB2(a, b, c);
    }

    // Hàm nhập một số nguyên từ bàn phím
    public static int nhapSoNguyen(String thongBao) {
        Scanner sc = new Scanner(System.in);
        System.out.print(thongBao);
        return sc.nextInt();
    }

    // Giải phương trình bậc nhất: ax + b = 0
    public static void giaiPTB1(int a, int b) {
        if (a != 0)
            System.out.println("Phương trình có nghiệm x = " + (-1.0 * b / a));
        else if (b == 0)
            System.out.println("Phương trình có vô số nghiệm");
        else
            System.out.println("Phương trình vô nghiệm");
    }

    // Giải phương trình bậc hai: ax² + bx + c = 0
    public static void giaiPTB2(int a, int b, int c) {
        double delta = b * b - 4.0 * a * c;
        if (delta < 0)
            System.out.println("Phương trình vô nghiệm");
        else if (delta == 0)
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b / (2.0 * a)));
        else {
            double x1 = (-b - Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2.0 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
