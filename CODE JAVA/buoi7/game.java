package buoi7;
import java.util.Random;
import java.util.Scanner;
//bài 11
public class game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String tiepTuc;

        do {
            int soMay = rd.nextInt(101); // 0–100
            int lanDoan = 0;
            boolean win = false;

            while (lanDoan < 7) {
                System.out.printf("Lan doan %d - Nhap so cua ban: ", lanDoan + 1);
                int soNguoi = sc.nextInt();
                lanDoan++;

                if (soNguoi == soMay) {
                    System.out.println("Ban doan dung roi");
                    win = true;
                    break;
                } else if (soNguoi < soMay) {
                    System.out.println("So ban doan nho hon!");
                } else {
                    System.out.println("So ban doan lon hon!");
                }
            }

            if (!win) {
                System.out.println("Ban doan sai roi, ket qua là: " + soMay);
            }

            System.out.print("Ban co muon choi lai khong? (y/n): ");
          tiepTuc = sc.next();
        } while (tiepTuc.equalsIgnoreCase("y"));

        System.out.println("Cam on ban da choi!");
    }
}

