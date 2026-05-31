package project1;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n (nguyen duong): ");
        n = sc.nextInt();
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S += 1.0 / i;
        }
        System.out.println("Tong S = " + S);
    }
}
