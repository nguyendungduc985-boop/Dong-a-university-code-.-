package buoi4;

public class kiemtrasonguyento {

    public static void main(String[] args) {
        // Tổng các số nguyên tố trong khoảng từ 1 đến n
        int n = 5;
        long tong = 0;

        for (int i = 1; i <= n; i++) {
            if (kiemTraSoNguyenTo(i)) {
                tong = tong + i;
            }
        }

        System.out.printf("Tong là cac so nguyen to tu 2..%d la %d: "  ,n,tong);
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean kiemTraSoNguyenTo(int a) {
        if (a < 2) return false; 

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) { // nếu chia hết cho i
                return false; 
            }
        }
        return true; 
    }
}

 //viết phương thức kiểm tra một số nguyên a là sô nguyên tố không
