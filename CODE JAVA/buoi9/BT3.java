package buoi9;
import java.util.Scanner;
public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhap x: ");
            double x = Double.parseDouble(sc.nextLine());
            System.out.print("Nhap y: ");
            double y = Double.parseDouble(sc.nextLine());
            double mau = x + 2 * y;
            if (mau == 0) {
                throw new ArithmeticException("Mau so (x + 2y) khong duoc bang 0!");
            }
            double bieuThuc = (x - y) / mau;
            if (bieuThuc < 0) {
                throw new ArithmeticException("Bieu thuc nam duoi dau can khong duoc am!");
            }
            double A = Math.sqrt(bieuThuc);
            System.out.println("Gia tri cua A la: " + A);
        } catch (NumberFormatException e) {
            System.out.println("Loi: Ban phai nhap dung dinh dang so!");
        } catch (ArithmeticException e) {
            System.out.println("Loi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Loi khong xac dinh!");
        }
    }
}
