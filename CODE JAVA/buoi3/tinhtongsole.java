package buoi3;
import java.util.Scanner;
public class tinhtongsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so tu nhien n: ");
        int n = sc.nextInt();

        int tong = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {  
                tong += i;
            }
        }

        System.out.println("Tong cac so le tu 1 den n " + n + " la: " + tong);
        sc.close();
    }
}


