package buoi8;
import java.util.Scanner;
public class chuoidoixung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi: ");
        String chuoiGoc = scanner.nextLine();
        String chuoiDaoNguoc = new StringBuilder(chuoiGoc).reverse().toString();
        if (chuoiGoc.equals(chuoiDaoNguoc)) {
            System.out.println("Day la 1 chuoi doi xung.");
        } else {
            System.out.println("Khong phai chuoi doi xung.");
        }    
        scanner.close();
    }
}