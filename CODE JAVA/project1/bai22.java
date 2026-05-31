package project1;
import java.util.Scanner;
public class bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ch) count++;
        }
        System.out.println("So lan xuat hien = " + count);
    }
}


