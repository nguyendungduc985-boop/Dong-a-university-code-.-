package buoi5;
//bài 5.1
public class mangsonguyen {
 public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.print("Cac phan tu trong mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) System.out.print(", ");
        }
    }
}

