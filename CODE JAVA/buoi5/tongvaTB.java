package buoi5;
public class tongvaTB {
    //bài 5.3
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 5, 50};
        int tong = 0;

        for (int x : a) {
            tong += x;
        }

        double tbc = (double) tong / a.length;
        System.out.println("Tong cac phan tu: " + tong);
        System.out.println("Trung binh cong: " + tbc);
    }
}

