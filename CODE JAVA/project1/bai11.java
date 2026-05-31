package project1;
import java.util.Scanner;
public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap h: ");
        double h = sc.nextDouble();
        double S = (a + b) * h / 2;
        System.out.printf("Dien tich hinh thang = %.3f\n", S);
    }
}

