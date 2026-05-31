package buoi9;
import java.util.Scanner;
public class BT1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Moi ban nhap so thu nhat: ");
            String so1 = sc.nextLine();

            System.out.print("Moi ban nhap so thu hai: ");
            String so2 = sc.nextLine();

            double a = Double.parseDouble(so1);
            double b = Double.parseDouble(so2);

            if (b == 0) {
                throw new ArithmeticException("Khong the chia cho 0");
            }

            double ketQua = a / b;

            System.out.println("Ket qua dung la: " + ketQua);

        } catch (ArithmeticException e) {
            System.out.println("Loi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Da xay ra loi khong xac dinh!");
        }
    }
}
