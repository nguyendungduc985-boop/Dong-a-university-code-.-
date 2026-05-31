package buoi6;
import java.util.Scanner;
public class bai2mang {
public static int[] nhapMang(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Nhap " + n + " so nguyen:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static int tongSoChinhPhuong(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (laSoChinhPhuong(num)) {
                sum += num;
            }
        }
        return sum;
    }
    public static boolean laSoChinhPhuong(int x) {
        if (x < 0) return false;
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }
    public static void hienThiMang(int[] arr) {
        System.out.print("Mang vua nhap: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu n: ");
        int n = scanner.nextInt();
        int[] mang = nhapMang(n);
        hienThiMang(mang);
        int tongCP = tongSoChinhPhuong(mang);
        System.out.println("Tong cac so chinh phuong trong mang la: " + tongCP);
    }
}

