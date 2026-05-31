package project1;
public class bai10 {
    public static void main(String[] args) {
        for (int ga = 0; ga <= 36; ga++) {
            int cho = 36 - ga;
            if (ga * 2 + cho * 4 == 100) {
                System.out.println("Ga = " + ga);
                System.out.println("Cho = " + cho);
            }
        }
    }
}
