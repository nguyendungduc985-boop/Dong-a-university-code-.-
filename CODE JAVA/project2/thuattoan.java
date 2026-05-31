package project2;
import java.util.Scanner;
public class thuattoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap a: ");
        int a = sc.nextInt();
        System.out.print("Moi ban nhap b: ");
        int b = sc.nextInt();
        int tong = a + b;
        System.out.println("ket qua la " + tong);
    }
}


