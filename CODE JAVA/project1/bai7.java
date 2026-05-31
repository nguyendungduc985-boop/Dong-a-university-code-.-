package project1;
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap goc x (do): ");
        double x = sc.nextDouble();
        double rad = x * Math.PI / 180;
        double sinx = Math.sin(rad);
        double cosx = Math.cos(rad);
        double tanx = Math.tan(rad);
        Double cotx = null; 
        if (tanx != 0) {
            cotx = 1 / tanx;
        }
        System.out.printf("sin(%.2f°) = %.4f\n", x, sinx);
        System.out.printf("cos(%.2f°) = %.4f\n", x, cosx);
        System.out.printf("tan(%.2f°) = %.4f\n", x, tanx);
        if (cotx == null) {
            System.out.printf("cot(%.2f°) = Khong xac dinh (tan = 0)\n", x);
        } else {
            System.out.printf("cot(%.2f°) = %.4f\n", x, cotx);
        }
    }
}
