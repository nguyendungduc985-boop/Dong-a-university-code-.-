package buoi7;
import java.util.Scanner;
public class luonggiac {
//bài 4 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhap canh a: "); a = sc.nextDouble();
        System.out.print("Nhap canh b: "); b = sc.nextDouble();
        System.out.print("Nhap canh c: "); c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Chu vi: %.3f\n", (a + b + c));
            System.out.printf("Dien tich: %.3f\n", S);
        } else {
            System.out.println("Khong tao thanh tam giac");
        }
    }
}


