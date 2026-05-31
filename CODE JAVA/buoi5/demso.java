package buoi5;
//bài 5.4
public class demso {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int dem = 0;

        for (int x : a) {
            if (x % 2 == 0) dem++;
        }

        System.out.println("So phan tu chia het cho 2 la: " + dem);
    }
}
