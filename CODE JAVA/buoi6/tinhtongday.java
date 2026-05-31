package buoi6;

// Tính tổng dãy S = 1 + 2 + 3 + ... + n
public class tinhtongday {
    public static void main(String[] args) {
        System.out.println(tongLap(5));
        System.out.println(tongDeQuy(5));
    }

    // Tính tổng theo phương pháp lặp
    public static long tongLap(int n) {
        long kq = 0;
        for (int i = 1; i <= n; i++) {
            kq += i;
        }
        return kq;
    }

    // Tính tổng theo phương pháp đệ quy
    public static long tongDeQuy(int n) {
        // Điều kiện dừng
        if (n == 0) return 0;
        // Công thức quy nạp: S(n) = n + S(n-1)
        return n + tongDeQuy(n - 1);
    }
}
