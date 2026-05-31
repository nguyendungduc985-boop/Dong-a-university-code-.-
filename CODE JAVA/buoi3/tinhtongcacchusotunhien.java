package buoi3;
import java.util.Scanner;
public class tinhtongcacchusotunhien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so tu nhien n: ");
        int n = sc.nextInt();

        int tong = 0;        
        int temp = n;        

        while (n > 0) {
            int chuSo = n % 10;  
            tong += chuSo;       
            n = n / 10;          
        }

        System.out.println("Tong cac chu so " + temp + " la: " + tong);

        sc.close();
    }
}

