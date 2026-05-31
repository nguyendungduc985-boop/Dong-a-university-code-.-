package project1;
import java.util.Scanner;
public class bai19 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int x : a) System.out.print(x + " ");
        System.out.println();
        int max = a[0], min = a[0], demChan = 0;
        for (int x : a) {
            if (x > max) max = x;
            if (x < min) min = x;
            if (x % 2 == 0) demChan++;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("So chan: " + demChan);
        System.out.print("So nguyen to: ");
        for (int x : a) {
            if (isPrime(x)) System.out.print(x + " ");
        }
        System.out.println();
        java.util.Arrays.sort(a);
        System.out.println("Mang sau khi sap xep:");
        for (int x : a) System.out.print(x + " ");
        System.out.println("\nNhap x can tim:");
        int x = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.println("Tim thay tai vi tri " + i);
                found = true;
            }
        }
        if (!found) System.out.println("Khong tim thay");
    }
}
