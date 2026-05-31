package buoi2;
import java.util.Scanner;

public class Tinhthue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap luong: ");
        double luong = sc.nextDouble();

        System.out.print("Nhap thuong: ");
        double thuong = sc.nextDouble();

        double thuNhap = luong + thuong;
        if (thuNhap < 9000000) {
            System.out.println("Khong can nop thue: " + (thuNhap ));
        } else 
        if (thuNhap >= 9000000) {
            System.out.println("Nop thue 10%: " + (thuNhap * 0.1));
        } else 
        
        if (thuNhap > 15000000) {
            System.out.println("Nop thue 15%: " + (thuNhap * 0.15));
        } else       
        if (thuNhap > 30000000) {
            System.out.println("Nop thue 20%: " + (thuNhap * 0.2));
        } else 
        sc.close();
    }
}
