package buoi3;
import java.util.Scanner;
public class vietbangcuuchuong2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
//viet bang cuu chuong
System.out.print("Nhap bang cuu chuong : ");
int n = sc.nextInt();
System.out.println("Bang cuu chuong " + n);
for (int i = 1; i <= 10; i++) {
System.out.println(n + " x " + i + " = " + (n * i));
}
//in ra tat ca cac bang cuu chuong tu 2 den 9
System.out.println("In ra tat ca cac bang cuu chuong tu 2 den 9");
for (int table = 2; table <= 9; table++) {
System.out.println("\nBang cuu chuong " + table );
for (int factor = 2; factor <= 9; factor++) {
System.out.println(table + " x " + factor + " = " + (table * factor));
}
}
sc.close();
}
}