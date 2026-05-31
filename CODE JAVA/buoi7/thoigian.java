package buoi7;
import java.util.Scanner;
public class thoigian {
//bài 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so giay: ");
        int t = sc.nextInt();

        int gio = t / 3600;
        int phut = (t % 3600) / 60;
        int giay = (t % 3600) % 60;

        System.out.printf("%02d:%02d:%02d\n", gio, phut, giay);
    }
}

