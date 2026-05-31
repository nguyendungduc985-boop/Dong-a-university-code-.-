package buoi8;
import java.util.Scanner;
public class tachvaghepchuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap cau: ");
        String chuoiGoc = scanner.nextLine();
        String[] mangTu = chuoiGoc.trim().split("\\s+");
        StringBuilder chuoiKetQua = new StringBuilder();
        for (int i = mangTu.length - 1; i >= 0; i--) {
            chuoiKetQua.append(mangTu[i]);
            if (i > 0) {
                chuoiKetQua.append(" ");
            }
        }
        System.out.println("Cau da dao nguoc: " + chuoiKetQua.toString());
        scanner.close();
    }
}
