package buoi3;

import java.util.Scanner;

public class doanoassword {
    public static void main(String[] args) {
        // tạo ra một cái password
        String password = "123456789";
        String doan = ""; 
        Scanner sc = new Scanner(System.in);
        int landoan=5;
        for (int i = 1; i <= landoan; i++) {
            System.out.println("Moi ban doan password (Lan thu " + i + "):");
            doan = sc.nextLine();
            if (doan.equals(password)) {
                System.out.println("Chuc mung ban da doan dung");
                break; 
            } 
            if (i < 5) {
                System.out.println("Ban doan sai, moi doan lai.");
            }
        }
        if (!doan.equals(password)) {
            System.out.println("Ban da het 5 luot doan.");
        }
        //lặp cho đến khi nào đoán đúng,lặp không biết số lần: while,do while
        while(true) //lặp mãi mãi
         {
            System.out.println("Moi ban doan password:");
            doan = sc.nextLine();
        //phản hồi kết quả đoán
            if (doan.equals(password)) {
                System.out.println("Chuc mung ban da doan dung");
                break; //thoát khỏi vòng lặp
            } else {
                System.out.println("Ban doan sai, moi doan lai.");
            }
            //sử dụng do while
            do {System.err.println("Moi ban doan password:");
           doan = sc.nextLine();
            } while (!password.equals(doan));
            System.out.println("Chuc mung ban da doan dung");
            System.err.println("ban da hoan thanh doan password");
        }
        sc.close();
    }
}
