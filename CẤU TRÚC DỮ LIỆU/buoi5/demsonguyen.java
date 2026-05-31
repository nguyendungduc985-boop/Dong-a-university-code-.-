package buoi5;
public class demsonguyen{
    public static int countDigitsIterative(int n ){
        if (n == 0) return 1;
        int count = 0;
        while (n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
    }
    public static int countDigitsRecursive(int n){
        if (n< 10){
            return 1;
        }
        return 1 +countDigitsRecursive(n / 10);
    }
}
