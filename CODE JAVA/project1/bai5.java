package project1;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        int hoa = 0, thuong = 0, so = 0, khoangTrang = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                hoa++;
            } else if (Character.isLowerCase(c)) {
                thuong++;
            } else if (Character.isDigit(c)) {
                so++;
            } else if (c == ' ') {
                khoangTrang++;
            }
        }
        System.out.println("So chu hoa: " + hoa);
        System.out.println("So chu thuong: " + thuong);
        System.out.println("So chu so: " + so);
        System.out.println("So khoang trang: " + khoangTrang);
    }
}
