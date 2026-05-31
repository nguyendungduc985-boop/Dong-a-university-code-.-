package project1;
import java.util.*;
public class bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        while (true) {
            int secret = rd.nextInt(101);
            int guess;
            int count = 0;
            System.out.println("Game bat dau!");
            while (count < 7) {
                System.out.print("Doan so: ");
                guess = sc.nextInt();
                count++;
                if (guess == secret) {
                    System.out.println("Chinh xac! Ban thang!");
                    break;
                } else if (guess < secret) {
                    System.out.println("Lon hon!");
                } else {
                    System.out.println("Nho hon!");
                }
            }
            if (count == 7) {
                System.out.println("Thua! So dung la: " + secret);
            }
            System.out.print("Choi tiep? (y/n): ");
            char c = sc.next().charAt(0);
            if (c == 'n' || c == 'N') break;
        }
    }
} 
 
