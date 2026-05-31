package project1;
import java.util.Scanner;
public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextDouble();
        double x = sc.nextDouble();
        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] + a[i+1] == x) {
                System.out.println("Tim thay tai vi tri: " + i + " va " + (i+1));
                found = true;
            }
        }
        if (!found) System.out.println("Khong co cap nao");
    }
}

