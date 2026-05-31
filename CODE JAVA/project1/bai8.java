package project1;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh a (>0): ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh b (>0): ");
        double b = sc.nextDouble();
        System.out.print("Nhap canh c (>0): ");
        double c = sc.nextDouble();
        if (a > 0 && b > 0 && c > 0 
            && a + b > c 
            && a + c > b 
            && b + c > a) {
            double chuVi = a + b + c;
            double p = chuVi / 2;  // nửa chu vi
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Chu vi tam giac: %.2f\n", chuVi);
            System.out.printf("Dien tich tam giac: %.2f\n", dienTich);
        } else {
            System.out.println("Khong tao thanh tam giac.");
        }
    }
}

