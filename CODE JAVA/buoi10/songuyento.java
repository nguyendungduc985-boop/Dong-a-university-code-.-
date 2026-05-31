package buoi10;
import java.util.Scanner;
public class songuyento {
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a) Nhap so n de kiem tra: ");
        int n = scanner.nextInt();
        if (laSoNguyenTo(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }
        System.out.println("--------------------------");
        System.out.print("b) Nhap so gioi han n de liet ke: ");
        int limit = scanner.nextInt();
        System.out.print("Cac so nguyen to tu 2 den " + limit + " la: ");
        for (int i = 2; i <= limit; i++) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
        scanner.close();
    }
}
