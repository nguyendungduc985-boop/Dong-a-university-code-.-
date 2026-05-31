package buoi5;
import java.util.*;
public class nhapsophantu {
//bài 5.5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(100); 
        }
        System.out.println("Mang ngau nhien:");
        System.out.println(Arrays.toString(a));
        int max = a[0], min = a[0];
        for (int x : a) {
            if (x > max) max = x;
            if (x < min) min = x;
        }

        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Gia tri nho nhat: " + min);
        System.out.print("Nhap so nguyen a: ");
        int b = sc.nextInt();

        int dem = 0;
        for (int x : a) {
            if (x > b) dem++;
        }
        System.out.println("So phan tu lon hon " + b + " la: " + dem);
    }
}

