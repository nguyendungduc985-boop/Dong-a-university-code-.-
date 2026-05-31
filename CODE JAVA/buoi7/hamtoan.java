package buoi7;
import java.util.Scanner;
public class hamtoan {
//bài 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        double S = 0;
        double gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
            S += Math.pow(x, i) / gt;
        }

        System.out.printf("Tong S = %.3f\n", S);
    }
}