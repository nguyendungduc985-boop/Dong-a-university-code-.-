package project1;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double S = 0;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            S += (double) i / factorial;  
        }
        System.out.println("Tong S = " + S);
    }
}
