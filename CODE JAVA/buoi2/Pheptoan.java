package buoi2;

public class Pheptoan {
    public static void main(String[] args) {
         double a = 5, b = 7, c = -1;
char op = '/';
switch(op) {
case '+' -> c = a + b;
case '-' -> c = a - b;
case 'x' -> c = a * b; 
case ':' -> c = a / b;
default -> System.out.println("Vui lòng chọn +, -, x và :");
}
System.out.println("c="+c);
}
}
