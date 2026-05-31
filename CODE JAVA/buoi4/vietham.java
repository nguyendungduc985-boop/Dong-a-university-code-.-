package buoi4;
import java.util.Scanner;

public class vietham {

    public static void Hoten(String hoTen) {
        System.out.println("Xin chào " + hoTen);
    }

    public static void main(String[] args) {
        Hoten("Nguyen Duc Dung");
        double diem = Nhapdiem();
        System.out.println("Điểm bạn vừa nhập là: " + diem);
    }

    // Hàm nhập điểm hợp lệ (0–10), chống lỗi nhập chữ
    public static double Nhapdiem() {
        Scanner sc = new Scanner(System.in);
        double diem = -1;

        while (true) {
            System.out.print("Mời bạn nhập điểm (từ 0 đến 10): ");
            if (sc.hasNextDouble()) { // kiểm tra xem người dùng có nhập số hay không
                diem = sc.nextDouble();
                if (diem >= 0 && diem <= 10) {
                    break; // nhập hợp lệ → thoát vòng lặp
                } else {
                    System.out.println("Điểm không hợp lệ, vui lòng nhập lại!");
                }
            } else {
                System.out.println("Bạn phải nhập số! Vui lòng nhập lại!");
                sc.next(); // bỏ qua dữ liệu sai (vd: abc)
            }
        }
        return diem;
    }
}
