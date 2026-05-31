package buoi10;
import java.util.Scanner;
import java.util.Random;
public class mangmotchieu {
    public static void NhapMang(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
    }
    public static void HienThiMang(int[] arr) {
        System.out.print("Cac phan tu trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
    public static int ViTriPhanTuTrongMang(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu n: ");
        int n = scanner.nextInt();
        int[] mangSoNguyen = new int[n];
        NhapMang(mangSoNguyen);
        HienThiMang(mangSoNguyen);
        System.out.print("Nhap so k can tim vi tri: ");
        int k = scanner.nextInt();
        int viTri = ViTriPhanTuTrongMang(mangSoNguyen, k);
        if (viTri != -1) {
            System.out.println("So " + k + " xuat hien lan dau tai vi tri index: " + viTri);
        } else {
            System.out.println("Khong tim thay sa " + k + " trong mang.");
        }
        scanner.close();
    }
}

