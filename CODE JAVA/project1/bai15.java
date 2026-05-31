package project1;
import java.util.Scanner;
public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        if (d < 0 || d > 10) {
            System.out.println("Diem khong hop le");
        } else if (d < 5) {
            System.out.println("Yeu");
        } else if (d < 6) {
            System.out.println("Trung binh");
        } else if (d < 7) {
            System.out.println("Trung binh kha");
        } else if (d < 8) {
            System.out.println("Kha");
        } else if (d < 9) {
            System.out.println("Gioi");
        } else {
            System.out.println("Xuat sac");
        }
    }
}

