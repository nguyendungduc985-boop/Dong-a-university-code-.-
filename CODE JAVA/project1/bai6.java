package project1;
import java.util.Scanner;
public class bai6 {
    public static void giaiPTBac1(double b, double c) {
        if (b == 0 && c == 0) {
            System.out.println("Phuong trinh vo so nghiem.");
        } else if (b == 0 && c != 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else {
            double x = -c / b;
            System.out.printf("Phuong trinh co 1 nghiem: x = %.2f\n", x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            System.out.println("\n=> a = 0 → Giai phuong trinh bac 1:");
            giaiPTBac1(b, c);
            return;
        }
        double delta = b * b - 4 * a * c;
        System.out.printf("\nDelta = %.2f\n", delta);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("Phuong trinh co nghiem kep: x = %.2f\n", x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet:");
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }
    }
}

