package buoi10;
import java.util.Scanner;
public class demsonguyenam {
    public static boolean laKyTuNguyenAm(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'u' || ch == 'e' || ch == 'o' || ch == 'a' || ch == 'i') {
            return true;
        }
        return false;
    }
    public static int demSoNguyenAm(String str) {
        int dem = 0;
            for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (laKyTuNguyenAm(ch)) {
                dem++;
            }
        }
        return dem;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap vao mot chuoi: ");
        String inputString = scanner.nextLine();
        int ketQua = demSoNguyenAm(inputString);
        System.out.println("So luong nguyen am co trong chuoi la: " + ketQua);
        scanner.close();
    }
}

