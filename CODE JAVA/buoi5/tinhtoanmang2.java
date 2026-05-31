package buoi5;

import java.util.Arrays;
import java.util.Scanner;

public class tinhtoanmang2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        nhapMang(a);
        System.out.println("Mang vua nhap: " + Arrays.toString(a));
        System.out.println("Tong cac phan tu: " + tongMang(a));
        System.out.println("Tong cac phan tu chan: " + tongChan(a));
        System.out.println("Tong cac phan tu la so nguyen to: " + tongNguyenTo(a));
    }
    public static void nhapMang(int[] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Nhap a[%d] = ", i);
            a[i] = sc.nextInt();
        }
    }
    public static int tongMang(int[] a) {
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            tong += a[i];
        }
        return tong;
    }

    public static int tongChan(int[] a) {
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                tong += a[i];
            }
        }
        return tong;
    }

        public static boolean laNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int tongNguyenTo(int[] a) {
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            if (laNguyenTo(a[i])) {
                tong += a[i];
            }
        }
        return tong;
    }
}
