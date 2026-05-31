package buoi8;
import java.util.Scanner;
public class daonguocchuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi can dao nguoc: ");
        String chuoiGoc = scanner.nextLine();
        String chuoiDaoNguoc = "";       
        for (int i = chuoiGoc.length() - 1; i >= 0; i--) {
            chuoiDaoNguoc = chuoiDaoNguoc + chuoiGoc.charAt(i);
        }
        System.out.println("Chuoi dao nguoc: " + chuoiDaoNguoc);
        scanner.close();
    }
}

