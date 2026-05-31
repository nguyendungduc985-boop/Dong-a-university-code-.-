import java.util.Scanner;
public class bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int hoa = 0, thuong = 0, so = 0, space = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) hoa++;
            else if (Character.isLowerCase(c)) thuong++;
            else if (Character.isDigit(c)) so++;
            else if (c == ' ') space++;
        }
        System.out.println("Hoa: " + hoa);
        System.out.println("Thuong: " + thuong);
        System.out.println("So: " + so);
        System.out.println("Khoang trang: " + space);
    }
}

