package buoi4;

public class Hamdemo {
    public static void main(String[] args) {
        System.out.println("Demo hàm");

        int x = 5, y = 7;  // hai số nguyên
        System.out.println("Số lớn nhất là: " + Tinhmax(x, y));

        // Dùng printf đúng kiểu dữ liệu
        System.out.printf("Tổng của %d và %d là: %.2f\n", x, y, Tinhtongsothuc(x, y));
    }

    public static int Tinhmax(int a, int b) {
        int max = a;
        if (b > max)
            max = b;
        return max;
    }

    public static double Tinhtongsothuc(double x, double y) {
        return x + y;
    }
}

