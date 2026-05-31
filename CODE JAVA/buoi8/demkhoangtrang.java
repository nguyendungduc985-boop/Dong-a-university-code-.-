package buoi8;
import java.util.Scanner;
public class demkhoangtrang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi: ");
        String chuoiNhap = scanner.nextLine();
        int dem = 0;
        for (int i = 0; i < chuoiNhap.length(); i++) {
            char kyTu = chuoiNhap.charAt(i);
            if (kyTu == ' ') {
                dem++;
            }
        }
        System.out.println("Khoang trang trong chuoi la: " + dem);
        scanner.close();
    }
}
