package buoi9;
import java.util.Scanner;
public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhap do dai mang n: ");
            int n = Integer.parseInt(sc.nextLine());
            if (n <= 0) {
                throw new Exception("Do dai mang phai lon hon 0!");
            }
            int[] arr = new int[n];
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap phan tu arr[" + i + "]: ");
                arr[i] = Integer.parseInt(sc.nextLine());
                sum += arr[i];
            }
            System.out.println("Tong cac phan tu trong mang = " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Loi: Ban phai nhap dung dinh dang so nguyen!");
        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
