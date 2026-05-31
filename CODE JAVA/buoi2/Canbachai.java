package buoi2;
import java.util.Scanner;

public class Canbachai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so bat ky");
        double x = sc.nextDouble();
        if (x >= 0) {
            double can = Math.sqrt(x);   
            System.out.println("Can bac hai " + x + " là: " + can);
    }
        else{
            System.err.println("khong the tinh duoc");
        sc.close();
        }
}
}

