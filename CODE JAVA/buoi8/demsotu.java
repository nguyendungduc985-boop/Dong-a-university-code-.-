package buoi8;
import java.util.Scanner;
public class demsotu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi: ");
        String chuoi = scanner.nextLine();
        chuoi = chuoi.trim();
        if (chuoi.isEmpty()) {
            System.out.println("So tu trong chuoi la: 0");
        } else {
            String[] cacTu = chuoi.split("\\s+");
            System.out.println("So tu trong chuoi la: " + cacTu.length);
        }
        scanner.close();
    }
}