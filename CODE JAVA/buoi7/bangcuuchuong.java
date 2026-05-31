package buoi7;
import java.util.Scanner;
//bài 9
public class bangcuuchuong {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong tu 2 den 9");
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap k (2 den 9): ");
        int k = sc.nextInt();
        if (k >= 2 && k <= 9) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", k, j, k * j);
            }
        } else {
            System.out.println("k khong hop le!");
        }
    }
}

