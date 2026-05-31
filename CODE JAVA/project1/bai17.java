package project1;
import java.util.Scanner;
public class bai17 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%d x %d = %d\n", k, j, k*j);
        }
    }
}

