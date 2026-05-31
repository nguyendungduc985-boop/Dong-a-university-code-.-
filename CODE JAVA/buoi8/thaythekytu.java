package buoi8;
import java.util.Scanner;
public class thaythekytu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi bat ky: ");
        String chuoiGoc = scanner.nextLine();
        System.out.print("Nhap ky tu can thay the: ");
        char kyTuCu = scanner.next().charAt(0);
        System.out.print("Nhap ky tu moi: ");
        char kyTuMoi = scanner.next().charAt(0);
        char[] mangKyTu = chuoiGoc.toCharArray();
        for (int i = 0; i < mangKyTu.length; i++) {
            if (mangKyTu[i] == kyTuCu) {
                mangKyTu[i] = kyTuMoi;
            }
        }
        String ketQua = new String(mangKyTu);
        System.out.println("Chuoi sau khi thay the: " + ketQua);
        scanner.close();
    }
}
