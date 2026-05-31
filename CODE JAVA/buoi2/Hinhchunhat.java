package buoi2;
import java.util.Scanner;
public class Hinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai hcn: ");
        double dai = sc.nextDouble();
        System.out.print("Nhap chieu rong hcn: ");
        double rong = sc.nextDouble();
        double chuViHCN = 2 * (dai + rong);
        double dienTichHCN = dai * rong;
        System.out.println("Chu vi hinh chu nhat: " + chuViHCN);
        System.out.println("Dien tich hinh chu nhat: " + dienTichHCN);
        sc.close();
    }
}