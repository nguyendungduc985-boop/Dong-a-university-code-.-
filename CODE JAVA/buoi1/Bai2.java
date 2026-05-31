package buoi1;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai 1");
        System.out.print("Nhap ten sinh vien 1: ");
        String ten1 = sc.nextLine();
        System.out.print("Nhap tuoi sinh vien 1: ");
        int tuoi1 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Nhap ten sinh vien 2: ");
        String ten2 = sc.nextLine();
        System.out.print("Nhap tuoi sinh vien 2: ");
        int tuoi2 = sc.nextInt();
        System.out.println("Sinh vien 1: " + ten1 + " - Tuoi: " + tuoi1);
        System.out.println("Sinh vien 2: " + ten2 + " - Tuoi: " + tuoi2);
        System.out.println();
        System.out.println("Bai 2");
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap so c: ");
        int c = sc.nextInt();
        int max = (a > b & a > c) ? a : (b > c ? b : c);
        System.out.println("So lon nhat trong 3 so la: " + max);
        System.out.println();
        System.out.println("Bai 3");
        System.out.print("Nhap so nguyen x: ");
        int x = sc.nextInt();
        System.out.print("Nhap so nguyen y: ");
        int y = sc.nextInt();
        System.out.println("Cong: " + (x + y));
        System.out.println("Tru: " + (x - y));
        System.out.println("Nhan: " + (x * y));
        if (y != 0) {
            System.out.println("Chia: " + ((double) x / y));
        } else {
            System.out.println("Khong the chia cho 0!");
        }
        System.out.println();
        System.out.println("Bai 4");
        System.out.print("Nhap ban kinh r: ");
        double r = sc.nextDouble();
        double chuViTron = 2 * Math.PI * r;
        double dienTichTron = Math.PI * r * r;
        System.out.println("Chu vi hinh tron: " + chuViTron);
        System.out.println("Dien tich hinh tron: " + dienTichTron);
        System.out.println();
        System.out.println("Bai 5");
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
