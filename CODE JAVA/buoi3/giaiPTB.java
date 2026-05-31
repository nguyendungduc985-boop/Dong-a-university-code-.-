package buoi3;

import java.util.Scanner;

public class giaiPTB {
    public static void main(String[] args) {
        // Khai báo và khởi tạo Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập a: ");
        // Lỗi 1: Cú pháp nhập liệu sai (sc scanner.nextDouble() -> scanner.nextDouble())
        double a = scanner.nextDouble(); 
        
        System.out.print("Nhập b: ");
        // Lỗi 1: Cú pháp nhập liệu sai (sc scanner.nextDouble() -> scanner.nextDouble())
        double b = scanner.nextDouble();
        
        // Giải phương trình bậc nhất: ax + b = 0
        
        if (a != 0) { // Trường hợp 1: a khác 0
            // Phương trình có nghiệm duy nhất x = -b/a
            double x = -b / a;
            System.out.println("Phương trình có nghiệm duy nhất x = " + x);
        } else { // Trường hợp 2: a bằng 0 (Phương trình trở thành 0x + b = 0 hay b = 0)
            if (b == 0) {
                // Trường hợp 2a: b bằng 0 (0 = 0)
                // Phương trình vô số nghiệm
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                // Trường hợp 2b: b khác 0 (Ví dụ: 5 = 0)
                // Phương trình vô nghiệm
                System.out.println("Phương trình vô nghiệm.");
            }
        }
        
        // Đóng Scanner sau khi sử dụng (thực hành tốt)
        scanner.close(); 
    }
}