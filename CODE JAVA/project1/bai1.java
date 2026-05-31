package project1;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();
        boolean isLeap = false;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        }
        if (isLeap) {
            System.out.println(year + " la nam nhuan");
        } else {
            System.out.println(year + " khong phai nam nhuan");
        }
    }
}

