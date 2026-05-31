package buoi5;
import java.util.*;
public class sapxep {
//bài 5.6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(100); 
        }
        System.out.println("Mang ban dau: " + Arrays.toString(a));
        int[] tang = a.clone();
        Arrays.sort(tang);
        System.out.println("Mang tang dan: " + Arrays.toString(tang));
        int[] giam = a.clone();
        Arrays.sort(giam);
        for (int i = 0; i < giam.length / 2; i++) {
            int temp = giam[i];
            giam[i] = giam[giam.length - 1 - i];
            giam[giam.length - 1 - i] = temp;
        }
        System.out.println("Mang giam dan: " + Arrays.toString(giam));
    }
}

