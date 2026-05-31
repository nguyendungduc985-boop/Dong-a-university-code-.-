package buoi8;
import java.util.Scanner;
public class timchuoicon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi ban dau: ");
        String chuoiBanDau = scanner.nextLine();
        System.out.print("Nhap chuoi con: ");
        String chuoiCon = scanner.nextLine();
        int viTri = chuoiBanDau.indexOf(chuoiCon);
        if (viTri != -1) {
            System.out.println("Ket qua: Chuoi con co ton tai trong chuoi ban dau.");
            System.out.println("Vi tri bat dau xuat hien la: " + viTri);
        } else {
            System.out.println("Ket qua: Chuoi con khong ton tai.");
        }       
        scanner.close();
    }
}
