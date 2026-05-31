package buoi6;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        if (n > 0) {
            System.out.printf("Tong S = %.6f", tinhTong(n));
        } else {
            System.out.println("Vui long nhap n > 0");
        }
        scanner.close();
    }
    public static double tinhTong(int n) {
        double tong = 0;
        long giaiThua = 1;  
        for(int i = 1; i <= n; i++) {
            giaiThua *= i;
            tong += (double)i / giaiThua;
        }
        return tong;
    }
}

