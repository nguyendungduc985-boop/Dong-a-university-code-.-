package buoi7;
import java.util.Scanner;
//bài 10
public class phuongtrinhbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: "); double a = sc.nextDouble();
        System.out.print("Nhap b: "); double b = sc.nextDouble();
        System.out.print("Nhap c: "); double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) System.out.println("Phuong trinh vo nghiem");
            else System.out.printf("Phuong trinh co 1 nghiem: x = %.3f\n", -c / b);
        } else {
            double delta = b*b - 4*a*c;
            if (delta < 0) System.out.println("Phuong trinh vo nghiem");
            else if (delta == 0) System.out.printf("Phuong trinh co nghiem kep x = %.3f\n", -b / (2*a));
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.printf("x1 = %.3f, x2 = %.3f\n", x1, x2);
            }
        }
    }
}