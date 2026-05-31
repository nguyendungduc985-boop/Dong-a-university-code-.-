package buoi3;
import java.util.Scanner;
public class tinhgiaithua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so tu nhien n: ");
        int n = sc.nextInt();

        long giaiThua = 1; 

        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.println(n + "! = " + giaiThua);

        sc.close();
    }
}


