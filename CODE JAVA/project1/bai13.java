package project1;
import java.util.Scanner;
public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int h = t / 3600;
        int m = (t % 3600) / 60;
        int s = (t % 3600) % 60;
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
    }
}
