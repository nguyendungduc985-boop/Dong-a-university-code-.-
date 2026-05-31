package buoi5;
import java.util.Scanner;
public class giatriphantu {
//bài 5.2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Cac phan tu trong mang: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}

