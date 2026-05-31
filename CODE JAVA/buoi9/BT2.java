package buoi9;
import java.util.Scanner;
public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap mot so nguyen: ");
        String input = sc.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.println("Ban da nhap so nguyen hop le: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Loi: Ban phai nhap dung dinh dang so nguyen!");
        }
    }
}
