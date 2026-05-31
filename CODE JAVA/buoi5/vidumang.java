package buoi5;

import java.util.Arrays;

public class vidumang {
    public static void main(String[] args) {
        System.out.println("Ví dụ về mảng");

        // khai báo mảng
        int[] a = new int[4];
        a[0] = 5;
        a[1] = 2;
        a[2] = 4;
        a[3] = 10;

        System.out.println(a[2]);
        System.out.println(a[0] + a[1]);

        int[] b = {5, 9, 2, 7};
        System.out.println(b[0] + 5);

        int[] c, d, e; // khai báo nhiều mảng

        // duyệt mảng a (cách 1: for thường)
        System.out.println("Độ dài mảng a: " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }

        System.out.println(); // xuống dòng

        // duyệt mảng a (cách 2: for-each)
        for (int pt : a) {
            System.out.print(pt + "  ");
        }

        System.out.println(); // xuống dòng

        // in ra toàn bộ mảng bằng Arrays.toString()
        System.out.println(Arrays.toString(a));
    }
}
