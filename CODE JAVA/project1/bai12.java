package project1;
import java.util.Scanner;
public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap R: ");
        double R = sc.nextDouble();
        double chuVi = 2 * Math.PI * R;
        double dienTich = Math.PI * R * R;
        System.out.printf("Chu vi = %.3f\n", chuVi);
        System.out.printf("Dien tich = %.3f\n", dienTich);
    }
}


