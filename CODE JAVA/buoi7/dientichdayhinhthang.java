package buoi7;
import java.util.Scanner;
public class dientichdayhinhthang {
//bài 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, h, S;
        System.out.print("Nhap day lon a: ");
        a = sc.nextDouble();
        System.out.print("Nhap day nho b: ");
        b = sc.nextDouble();
        System.out.print("Nhap chieu cao h: ");
        h = sc.nextDouble();

        S = (a + b) * h / 2;
        System.out.println("Dien tich hinh thang la: " + S);
    }
}
