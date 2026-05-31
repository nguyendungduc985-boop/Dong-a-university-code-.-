package buoi8;
import java.util.Scanner;
public class bokhoangtrang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi can bo khoang trang: ");
        String chuoiGoc = scanner.nextLine();
        String chuoiChuan = chuoiGoc.trim().replaceAll("\\s+", " ");
        System.out.println("Chuoi ban dau: " + chuoiGoc + "");
        System.out.println("Chuoi chuan hoa: " + chuoiChuan + "");
        scanner.close();
    }
}