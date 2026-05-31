package project1;
import java.util.Scanner;
public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Ma tran:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        int mn = a[0][0];
        for (int[] row : a)
            for (int x : row)
                if (x < mn) mn = x;
        System.out.println("Min = " + mn);
        int maxOdd = -1;
        for (int[] row : a)
            for (int x : row)
                if (x % 2 != 0 && x > maxOdd)
                    maxOdd = x;
        System.out.println("Le lon nhat = " + maxOdd);
        int bestRow = 0, bestSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) sum += a[i][j];
            if (i == 0 || sum > bestSum) {
                bestSum = sum;
                bestRow = i;
            }
        }
        System.out.println("Dong co tong lon nhat: " + bestRow);
    }
}

