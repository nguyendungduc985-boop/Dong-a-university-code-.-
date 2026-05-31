package project1;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        char kt;
        System.out.print("Moi ban nhap so nguyen a: ");
        a = sc.nextInt();
        System.out.print("Moi ban nhap so nguyen b: ");
        b = sc.nextInt();
        System.out.print("Moi ban nhap phep toan (+ - * /): ");
        kt = sc.next().charAt(0);
        // Xử lý phép toán
        switch (kt) {
            case '+':
                System.out.println("Ket qua: " + (a + b));
                break;
            case '-':
                System.out.println("Ket qua: " + (a - b));
                break;
            case '*':
                System.out.println("Ket qua: " + (a * b));
                break;
            case '/':
                System.out.println("Ket qua:" + (a/b));
                break;
        }
    }
}
