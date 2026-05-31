package buoi3;

public class fordemo {
    public static void main(String[] args) {
        System.out.println("demo cau truc lap for");
        //in một chữ hello
        System.out.println("hello");
        //in một ngàn chữ hello
        for(int i =1; i<=10;i++) {
            System.out.println("hello");
        }
        //tổng S=1+2+.....n
        int n=100;
        long tong=0;
        //tong=tong+1
        //tong=tong+2
        //tong=tong+3
        //...........
        //tong=tong+n
        for(int i=1;i<=n;i++) {
            tong=tong+i;
        }
        System.out.println("Tong S= "+tong);
        //tổng số lẻ s=1+3+5+...+n
        tong=0;
        for(int i=1;i<=n;i=i+2) {
            tong=tong+i;
        }
        System.out.println("Tong so le S= "+tong);
    }
}