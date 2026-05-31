package buoi3;
import java.util.Scanner;
public class uoclonnhat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();
        
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println("Uoc so chung lon nhat " + a + " và " + b + " là: " + x);
        sc.close();
    }
}
