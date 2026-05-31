package buoi6;

import java.util.Scanner;

public class manghaichieu {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng 2 chiều 3x3
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // In phần tử cụ thể: hàng 0, cột 1
        System.out.println("Phan tu a[0][1] = " + a[0][1]); // Output: 2

        // In tất cả phần tử trong mảng a
        System.out.println("\nTat ca phan tu trong mang a:");
        for (int i = 0; i < 3; i++) {        // i là hàng
            for (int j = 0; j < 3; j++) {    // j là cột
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // xuống dòng sau mỗi hàng
        }
        
        // --- Phần tạo và nhập mảng b ---
        
        // Tạo một mảng có n dòng, m cột
        int n = 2, m = 3; // **Lỗi 1: Thêm dấu ';'**
        int[][] b = new int[n][m];
        
        // Nhập mảng b từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Nhap cac phan tu cho mang b (" + n + "x" + m + ") ---");
        
        // b.length trả về số hàng (số lượng mảng con)
        for(int i = 0; i < b.length; i++){ 
            // b[i].length (hoặc b[0].length) trả về số cột của hàng i
            for(int j = 0; j < b[i].length; j++){
                System.out.printf("Nhap phan tu b[%d][%d]= ", i, j);
                // **Lỗi 2: Thêm [j] và sc.nextInt()**
                b[i][j] = sc.nextInt(); 
            }
        }
        
        // In mảng b ra màn hình
        System.out.println("\n--- Cac phan tu trong mang b da nhap ---");
        
        // b.length trả về số hàng
        for (int i = 0; i < b.length; i++) { 
            // b[i].length trả về số cột
            for (int j = 0; j < b[i].length; j++) { 
                System.out.print(b[i][j] + " ");
            }
            System.out.println(); // xuống dòng sau mỗi hàng
        }
        
        sc.close(); // Đóng Scanner
    }
}