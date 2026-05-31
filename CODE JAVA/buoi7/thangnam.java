package buoi7;
import java.util.Scanner;
//bài 8
public class thangnam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang (1 den 12): ");
        int thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        int nam = sc.nextInt();
        int ngay;
        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12 -> ngay = 31;
            case 4, 6, 9, 11 -> ngay = 30;
            case 2 -> {
                if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0)
                    ngay = 29;
                else
                    ngay = 28;
            }
            default -> {
                System.out.println("Thang khong hop le!");
                return;
            }
        }
        System.out.printf("Thang %d nam %d co %d ngay\n", thang, nam, ngay);
    }
}

