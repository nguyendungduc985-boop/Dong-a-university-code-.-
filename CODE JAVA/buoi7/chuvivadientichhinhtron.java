package buoi7;
import java.util.Scanner;
public class chuvivadientichhinhtron {
//bài 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = Math.PI;
        double R;

        System.out.print("Nhap ban kinh R > 0: ");
        R = sc.nextDouble();

        if (R > 0) {
            double chuVi = 2 * PI * R;
            double dienTich = PI * R * R;
            System.out.printf("Chu vi = %.3f\n", chuVi);
            System.out.printf("Dien tich = %.3f\n", dienTich);
        } else {
            System.out.println("Ban kinh phai > 0!");
        }
    }
}


