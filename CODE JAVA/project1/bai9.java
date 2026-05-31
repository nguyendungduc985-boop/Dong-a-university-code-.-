package project1;
import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double S = 0;
        double tu = 1;
        double mau = 1;
        for (int i = 1; i <= n; i++) {
            tu *= x;
            mau *= i;
            S += tu / mau;
        }
      System.out.printf("Tong S = %.3f\n", S);
    }
}
