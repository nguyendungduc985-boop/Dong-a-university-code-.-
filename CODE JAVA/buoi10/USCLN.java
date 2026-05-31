package buoi10;
import java.util.Scanner;
public class USCLN {
    private static int timUSCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trinh tim USCLN");
        System.out.print("Nhap so tu nhien a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so tu nhien b: ");
        int b = scanner.nextInt();
        int result = timUSCLN(a, b);
        System.out.println("uoc so chung lon nhat cua " + a + " va " + b + " la: " + result);
        scanner.close();
    }
}